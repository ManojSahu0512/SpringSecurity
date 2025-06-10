//package com.npci.SpringSecurityProject.config;
//
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfigCreatingMultipleUserNamePassword {
//    @Bean
//    public UserDetailsService userDetailsService(){
//        UserDetails user1= User.withUsername("manoj.sahu")
//                .password("{noop}pass@123")//noop means no encoding no hashing
//                .roles("ADMIN")
//                .build();
//
//        UserDetails user2= User.withUsername("vishal.shinde")
//                .password("{noop}Vishal@123")//noop means no encoding no hashing
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(user1,user2);
//    }
//}
////The default format for storing the password is: {id}encoded_password
////{id} can be either
////-{noop}
////-{bcrypt}
////{sha256}
//
