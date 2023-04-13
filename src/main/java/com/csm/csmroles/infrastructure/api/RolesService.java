package com.csm.csmroles.infrastructure.api;

import com.csm.csmroles.domain.RolesDomainService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class RolesService {

    private final RolesDomainService rolesDomainService;

    String getUserRoles(String userId) {
        return rolesDomainService.getUserRoles(userId);
    }

    String addUserRole(AddUserRoleRequest addUserRoleRequest) {
        return "";
    }

    void updateRole(UpdateRoleRequest updateRoleRequest) {

    }

    void deleteRole(String userId) {

    }
}
