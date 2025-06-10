//package com.npci.SpringSecurityProject.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//@EnableWebSecurity
//public class StoreHashedPassword {
//    @Bean
//    public UserDetailsService userDetailsService(){
//        UserDetails user3= User.withUsername("manoj.sahu")
//                .password("{bcrypt}"+ new BCryptPasswordEncoder().encode("my_password_1"))//
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(user3);
//    }
//}
