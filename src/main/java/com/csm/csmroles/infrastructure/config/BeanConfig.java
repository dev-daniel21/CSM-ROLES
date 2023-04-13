package com.csm.csmroles.infrastructure.config;

import com.csm.csmroles.domain.RolesDomainService;
import com.csm.csmroles.domain.ports.RolesRepository;
import com.csm.csmroles.infrastructure.adapters.RolesRepositoryImpl;
import com.csm.csmroles.infrastructure.database.UserRoleJPARepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BeanConfig {

    @Bean
    public RolesRepository rolesRepository(UserRoleJPARepository userRoleJPARepository) {
        return new RolesRepositoryImpl(userRoleJPARepository);
    }

    @Bean
    public RolesDomainService rolesDomainService(RolesRepository rolesRepository) {
        return new RolesDomainService(rolesRepository);
    }
}
