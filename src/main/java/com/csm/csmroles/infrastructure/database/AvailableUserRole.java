package com.csm.csmroles.infrastructure.database;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public enum AvailableUserRole {
    SUBCONTRACTOR,
    INSPECTOR,
    ENGINEER,
    SITE_MANAGER,
    WORKER,
    INVESTOR,
    PROJECT_MANAGER
}
