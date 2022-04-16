package com.kanyelings.studentlograpi.business.service;


import com.kanyelings.studentlograpi.api.dto.LogrUserDto;

public interface LogrUserService {
    Long createUser(String email, String password);
    LogrUserDto getUser(Long id);
    LogrUserDto getUser(String username);
    boolean deleteUser(Long id);
    boolean deleteUser(String username);
    boolean updateUser(LogrUserDto user);

}
