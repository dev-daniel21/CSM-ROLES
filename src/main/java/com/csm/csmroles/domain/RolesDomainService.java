package com.csm.csmroles.domain;

import com.csm.csmroles.domain.ports.RolesRepository;

import com.csm.csmroles.infrastructure.database.AvailableUserRole;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RolesDomainService {

    private final RolesRepository rolesRepository;

    public String getUserRoles(String userId) {
        return rolesRepository.getUserRole(userId);
    }

    public String addUserRoles(String userId, AvailableUserRole availableUserRole) {
        return rolesRepository.addUserRole(userId, availableUserRole);
    }
}
