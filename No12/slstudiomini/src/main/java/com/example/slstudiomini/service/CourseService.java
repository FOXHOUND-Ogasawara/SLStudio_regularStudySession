package com.example.slstudiomini.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.slstudiomini.model.Course;
import com.example.slstudiomini.repository.CourseRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Service
public class CourseService {
    
    // 課題B-1
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private CourseRepository courseRepository;


    // 課題B-1, B-2
    public List<Course> findAllCourses() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Course> cq = cb.createQuery(Course.class);
        Root<Course> course = cq.from(Course.class);
        cq.select(course);
        cq.where(cb.isNull(course.get("deletedAt")));
        return entityManager.createQuery(cq).getResultList();
    }

    // 課題B-1
    public Course findCourseById(Long id) {
        return entityManager.find(Course.class, id);
    }

    @Transactional
    public Course save(Course course) {
        if (course != null) {
            course.setCreatedAt(LocalDateTime.now());
            courseRepository.save(course);
        }
        return course;
    }

    @Transactional
    public Course update(Course updateCourse) {
        Course course = findCourseById(updateCourse.getId());
        course.setName(updateCourse.getName());
        course.setDescription(updateCourse.getDescription());
        course.setUpdatedAt(LocalDateTime.now());

        return courseRepository.save(course);
    }

    @Transactional
    public void delete(Course deletedCourse) {
        Course course = findCourseById(deletedCourse.getId());
        course.setDeletedAt(LocalDateTime.now());
        course.getLessons().forEach(lesson -> lesson.setDeletedAt(LocalDateTime.now()));
        courseRepository.save(course);
    }
}
