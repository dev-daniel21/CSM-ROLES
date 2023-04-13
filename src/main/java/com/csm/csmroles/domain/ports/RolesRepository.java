package com.csm.csmroles.domain.ports;

import com.csm.csmroles.infrastructure.database.AvailableUserRole;

public interface RolesRepository {

    String getUserRole(String userId);

    String addUserRole(String userId, AvailableUserRole availableUserRole);

}
