//package com.npci.SpringSecurityProject.config.DBLevelAuth;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfigUserAuth {
//    @Bean
//   public PasswordEncoder passwordEncoder(){
//       return new BCryptPasswordEncoder();
//   }
//
//   @Bean
//   public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(auth->auth
//                .requestMatchers("/auth/register").permitAll()
//                .anyRequest().authenticated()
//        )
//                .csrf(csrf->csrf.disable())
//                .httpBasic(Customizer.withDefaults())
//        ;
//        return http.build();
//
//   }
//}
//
//
////// Add headers configuration
////            .headers(headers -> headers
////                .frameOptions(frameOptions -> frameOptions
////                    .sameOrigin() // Allows framing from the same origin
////                    // Alternatively use .disable() for development only
////                )
////                // Optional: Add Content Security Policy for modern browsers
////                .contentSecurityPolicy(csp -> csp
////                    .policyDirectives("frame-src 'self'")
////                )
////            );
