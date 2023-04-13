package com.csm.csmroles.infrastructure.database;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class UserRoleJPARepositoryTest {

    @Autowired
    UserRoleJPARepository userRoleJPARepository;

    @Test
    void should_find_two_users_and_add_another() {
        // given
        long count = userRoleJPARepository.count();

        // when
        userRoleJPARepository.save(
                new UserRole(UUID.randomUUID().toString(), AvailableUserRole.INSPECTOR, UUID.randomUUID().toString()));

        // then
        long countAgain = userRoleJPARepository.count();

        assertThat(count).isEqualTo(2);
        assertThat(countAgain).isEqualTo(3);
    }

}