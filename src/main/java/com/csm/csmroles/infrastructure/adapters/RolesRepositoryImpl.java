package com.csm.csmroles.infrastructure.adapters;

import com.csm.csmroles.domain.ports.RolesRepository;
import com.csm.csmroles.infrastructure.database.UserRoleJPARepository;
import com.csm.csmroles.infrastructure.database.AvailableUserRole;
import com.csm.csmroles.infrastructure.database.UserRole;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class RolesRepositoryImpl implements RolesRepository {

    private final UserRoleJPARepository userRoleJPARepository;

    @Override
    public String getUserRole(String userId) {

        return userRoleJPARepository.findByUserId(userId).getAssignedRole().name();
    }

    @Override
    public String addUserRole(String userId, AvailableUserRole userRole) {
        return userRoleJPARepository.save(
                new UserRole(UUID.randomUUID().toString(), userRole, userId)).toString();
    }
}
