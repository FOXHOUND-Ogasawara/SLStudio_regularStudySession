package com.example.slstudiomini.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.slstudiomini.dev.DevAuthentiocationFilter;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@Profile("dev")
public class DevSecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .addFilterBefore(new DevAuthentiocationFilter(), UsernamePasswordAuthenticationFilter.class)
            .formLogin(login -> login
                .defaultSuccessUrl("/")
                ).logout(logout -> logout
                    .logoutSuccessUrl("/")
                ).authorizeHttpRequests(authz -> authz
                    .requestMatchers(PathRequest.toStaticResources()
                        .atCommonLocations()).permitAll()
                    .requestMatchers("/study/**").hasRole("USER")
                    .requestMatchers("/admin/**").hasRole("ADMIN")
                    .anyRequest().authenticated()
                );
            return http.build();
    }

    @Bean
    public PasswordEncoder PasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
