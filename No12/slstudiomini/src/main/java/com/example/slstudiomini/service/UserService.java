package com.example.slstudiomini.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.slstudiomini.exception.MyUniqueConstraintViolationException;
import com.example.slstudiomini.model.Authority;
import com.example.slstudiomini.model.User;
import com.example.slstudiomini.repository.AuthorityRepository;
import com.example.slstudiomini.repository.UserRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Service
public class UserService {
    
    // 課題B-3
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    public User findUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User Not Found With id: " + id));
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User addEnableStudentAndHashPassword(User user) {
        User uniqueUser = userRepository.findByUsername(user.getUsername());
        if (uniqueUser != null) {
            throw new MyUniqueConstraintViolationException("既に存在するユーザーです");
        }
        user.setEnabled(true);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashhedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashhedPassword);

        Authority authority = authorityRepository.findByAuthority("ROLE_USER").orElseThrow(() -> new EntityNotFoundException("Authority Not Found With name = USER"));

        user.setAuthorities(Set.of(authority));
        return userRepository.save(user);
    }

    // 課題B-3
    public List<User> findUserWithUserRole() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> user = cq.from(User.class);

        Join<User, Authority> authorityJoin = user.join("authorities");
        Predicate userRolePredicate = cb.equal(authorityJoin.get("role"), "USER");
        Predicate enabledPredicate = cb.isTrue(user.get("enabled"));

        cq.where(cb.and(userRolePredicate, enabledPredicate));

        List<User> users = entityManager.createQuery(cq).getResultList();
        return users;
    }

}
