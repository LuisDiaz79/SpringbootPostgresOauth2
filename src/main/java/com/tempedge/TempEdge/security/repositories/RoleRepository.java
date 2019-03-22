package com.tempedge.TempEdge.security.repositories;

import com.tempedge.TempEdge.Domain.SecurityEntities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
