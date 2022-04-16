package com.kanyelings.studentlograpi.business.service.impl;

import com.kanyelings.studentlograpi.api.dto.LogrUserDto;
import com.kanyelings.studentlograpi.business.service.LogrUserService;
import com.kanyelings.studentlograpi.data.entity.LogrUser;
import com.kanyelings.studentlograpi.data.repository.LogrUserRepository;
import com.kanyelings.studentlograpi.exception.advice.LogrException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LogrUserServiceImplTest {
    private final LogrUserService logrUserService;
    private final LogrUserRepository logrUserRepository;

    private LogrUser testUser;

    @Autowired
    public LogrUserServiceImplTest(LogrUserServiceImpl logrUserService, LogrUserRepository logrUserRepository) {
        this.logrUserService = logrUserService;
        this.logrUserRepository = logrUserRepository;
    }

    @BeforeEach
    public void preTest() {
        logrUserRepository.deleteAll();
        testUser = LogrUser.builder()
                .email("user@mail.com")
                .password("password")
                .build();
    }

    @Test
    void createUser() {
        assertNotEquals(logrUserService.createUser("user@mail.com", "password"), -1);

        assertThrows(LogrException.class, () -> logrUserService.createUser("user@mail.com", "password"));
    }

    @Test
    void getUser() {
        Long id = logrUserService.createUser(testUser.getEmail(), testUser.getPassword());

        assertNotEquals(id, -1);
        assertNotNull(logrUserService.getUser(id));

        assertThrows(LogrException.class, () -> logrUserService.getUser(-1L));
    }

    @Test
    void getUserByUsername() {
        logrUserService.createUser(testUser.getEmail(), testUser.getPassword());

        assertNotNull(logrUserService.getUser(testUser.getEmail()));
        assertEquals(logrUserService.getUser(testUser.getEmail()).getEmail(), testUser.getEmail());

        assertThrows(LogrException.class, () -> logrUserService.getUser(""));

    }

    @Test
    void deleteUser() {
        Long id = logrUserService.createUser(testUser.getEmail(), testUser.getPassword());

        assertTrue(logrUserService.deleteUser(id));
        assertThrows(LogrException.class, () -> assertFalse(logrUserService.deleteUser(-1L)));
    }

    @Test
    void deleteUserByUsername() {
        logrUserService.createUser(testUser.getEmail(), testUser.getPassword());

        assertTrue(logrUserService.deleteUser(testUser.getEmail()));
        assertThrows(LogrException.class, () -> assertFalse(logrUserService.deleteUser("")));
    }

    @Test
    void updateUser() {
        // trial 1
        Long id = logrUserService.createUser(testUser.getEmail(), testUser.getPassword());

        logrUserService.updateUser(LogrUserDto.builder().userId(id).email("user2@mail.com").password("password2").build());

        assertEquals(logrUserService.getUser(id).getEmail(), "user2@mail.com");
        assertEquals(logrUserService.getUser(id).getPassword(), "password2");


        // trial 2
        testUser = LogrUser.builder().email("user10@mail.com").password("password10").build();
        Long id2 = logrUserService.createUser(testUser.getEmail(), testUser.getPassword());

        logrUserService.updateUser(LogrUserDto.builder().userId(id2).email("user11@mail.com").build());

        assertEquals(logrUserService.getUser(id2).getEmail(), "user11@mail.com");
        assertEquals(logrUserService.getUser(id2).getPassword(), testUser.getPassword());
    }
}
