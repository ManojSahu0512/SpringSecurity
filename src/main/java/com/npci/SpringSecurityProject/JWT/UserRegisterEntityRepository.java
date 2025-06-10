package com.npci.SpringSecurityProject.JWT;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRegisterEntityRepository extends JpaRepository<UserRegisterEntity,Long> {
    Optional<UserRegisterEntity> findByUsername(String username);
}
