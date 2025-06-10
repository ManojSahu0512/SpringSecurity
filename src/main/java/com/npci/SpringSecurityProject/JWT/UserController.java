package com.npci.SpringSecurityProject.JWT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRegisterEntityService userRegisterEntityService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("/user-register")
    public ResponseEntity<String> register(@RequestBody UserRegisterEntity userRegisterDetails){
        //Hash thr password before saving
        userRegisterDetails.setPassword(passwordEncoder.encode(userRegisterDetails.getPassword()));
        userRegisterEntityService.save(userRegisterDetails);
        return ResponseEntity.ok("User registered successfully!");
    }
    @PostMapping("/users")
    public  String getUserDetails(){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        return "Fetch user details successfully!";
    }
}
