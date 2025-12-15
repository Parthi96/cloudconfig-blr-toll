package com.parthi.config_client;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                // Disable CSRF for REST endpoints
                .csrf().disable()

                .authorizeRequests()
                // Allow health check without auth
                .antMatchers("/actuator/health").permitAll()

                // Encrypt / Decrypt only for ADMIN
                .antMatchers("/encrypt", "/decrypt").hasRole("ADMIN")

                // All other endpoints require authentication
                .anyRequest().authenticated()
                .and()

                // Use Basic Authentication
                .httpBasic();
    }
}
