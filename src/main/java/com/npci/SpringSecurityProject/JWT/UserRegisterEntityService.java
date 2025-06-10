package com.npci.SpringSecurityProject.JWT;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterEntityService implements UserDetailsService {
    @Autowired
    UserRegisterEntityRepository userAuthEntityRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userAuthEntityRepository.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("User not found!"));
    }

    public UserDetails save(UserRegisterEntity userRegisterEntity){
        return userAuthEntityRepository.save(userRegisterEntity);
    }
}
