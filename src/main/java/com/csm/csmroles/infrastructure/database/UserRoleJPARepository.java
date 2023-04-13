package com.csm.csmroles.infrastructure.database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleJPARepository extends JpaRepository<UserRole, Long> {

    UserRole findByUserId(String userId);
}
