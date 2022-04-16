package com.kanyelings.studentlograpi.business.mapper;

import com.kanyelings.studentlograpi.api.dto.LogrUserDto;
import com.kanyelings.studentlograpi.data.entity.LogrUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LogrUserMapperTest {

    private final LogrUserMapper logrUserMapper;

    @Autowired
    public LogrUserMapperTest(LogrUserMapper logrUserMapper) {
        this.logrUserMapper = logrUserMapper;
    }

    @BeforeEach
    void setUp() {
    }

    @Test
    void mapLogrUserToDto() {
        LogrUser logrUser = LogrUser.builder()
                .userId(1L)
                .email("username")
                .password("password").build();
        LogrUserDto logrUserDto = logrUserMapper.mapLogrUserToDto(logrUser);

        assertEquals(logrUser.getUserId(), logrUserDto.getUserId());
        assertEquals(logrUser.getEmail(), logrUserDto.getEmail());
        assertEquals(logrUser.getPassword(), logrUserDto.getPassword());
    }

    @Test
    void mapDtoToLogrUser() {
        LogrUserDto logrUserDto = LogrUserDto.builder()
                .userId(1L)
                .email("username")
                .password("password").build();
        LogrUser logrUser = logrUserMapper.mapDtoToLogrUser(logrUserDto);

        assertEquals(logrUserDto.getUserId(), logrUser.getUserId());
        assertEquals(logrUserDto.getEmail(), logrUser.getEmail());
        assertEquals(logrUserDto.getPassword(), logrUser.getPassword());
    }
}
