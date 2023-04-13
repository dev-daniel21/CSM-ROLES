package com.csm.csmroles;

import com.csm.csmroles.infrastructure.database.UserRoleJPARepository;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CsmRolesApplicationTests {

	@Autowired
    UserRoleJPARepository userRoleJPARepository;

	@Test
	void contextLoads() {
	}

	@Test
	void should_find_two_users_in_database() {
		// given
		// when
		long count = userRoleJPARepository.count();

		//then
		assertThat(count).isEqualTo(2);
	}

}
