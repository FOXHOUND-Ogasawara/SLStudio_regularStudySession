package com.example.slstudiomini.dev;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;

import org.springframework.context.annotation.Profile;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import com.example.slstudiomini.model.Authority;
import com.example.slstudiomini.model.CustomUserDetails;
import com.example.slstudiomini.model.User;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Component
@Profile("dev")
public class DevAuthentiocationFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request,
        ServletResponse response, FilterChain chain)
        throws IOException, ServletException {

        Authority dummyAthority = new Authority();
        dummyAthority.setId(1L);
        dummyAthority.setAuthority("ROLE_ADMIN");

        User dummyUser = new User();
        dummyUser.setId(1L);
        dummyUser.setUsername("dummyTeacher");
        dummyUser.setPassword("dummyPassword");
        dummyUser.setEnabled(true);
        dummyUser.setAuthorities(new HashSet<>(Collections.singletonList(dummyAthority)));

        CustomUserDetails user = new CustomUserDetails(dummyUser);
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());

        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(request, response);
    }
    
}
