package com.tempedge.TempEdge.security.repositories;


import com.tempedge.TempEdge.Domain.SecurityEntities.UserSecurity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


/**
 * User repository for CRUD operations.
 */
public interface UserRepository extends JpaRepository<UserSecurity,Long> {
    Optional<UserSecurity> findByUsername(String username);
}