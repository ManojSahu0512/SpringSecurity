package com.npci.SpringSecurityProject.config.DBLevelAuth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserAuthEntityService implements UserDetailsService {
    //Implements UserDetails service the same reason, during authentication,
    // based on authentication method we are using Basic,jwt form etc.,
    // it will try to load user first,but since we are using DB for storing
    //the username and password,spring security don't know how to fetch it,
    //so we have to implement UserDetailsService and override the method
    //"loadUserByUsername"

    @Autowired
    private UserAuthEntityRepository userAuthEntityRepository;

    public UserDetails save(UserAuthEntity userAuth){
        return userAuthEntityRepository.save(userAuth);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userAuthEntityRepository.findByUsername(username)
                .orElseThrow(()->new UsernameNotFoundException("User not found"));
    }
}
