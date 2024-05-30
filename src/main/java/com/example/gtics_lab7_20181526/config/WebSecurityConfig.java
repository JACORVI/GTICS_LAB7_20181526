package com.example.gtics_lab7_20181526.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Bean;

@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.formLogin();
        http.authorizeHttpRequests()
                .requestMatchers("/employee","/employee/**").authenticated()
                .requestMatchers("/shipper","/shipper/**").authenticated()
                .anyRequest().permitAll();

        return http.build();
    }

}
