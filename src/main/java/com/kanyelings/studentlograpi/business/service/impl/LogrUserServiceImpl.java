package com.kanyelings.studentlograpi.business.service.impl;


import com.kanyelings.studentlograpi.api.dto.LogrUserDto;
import com.kanyelings.studentlograpi.business.mapper.LogrUserMapper;
import com.kanyelings.studentlograpi.business.service.LogrUserService;
import com.kanyelings.studentlograpi.data.entity.LogrUser;
import com.kanyelings.studentlograpi.data.repository.LogrUserRepository;
import com.kanyelings.studentlograpi.exception.LogrUserException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@Slf4j
@Getter
@Setter
@AllArgsConstructor
@Service
public class LogrUserServiceImpl implements LogrUserService {
    private final LogrUserRepository logrUserRepository;
    private LogrUserMapper logrUserMapper;

    @Override
    public Long createUser(String email, String password) {
        log.info("Creating user with email: {}", email);

        AtomicBoolean success = new AtomicBoolean(false);

        LogrUser user = LogrUser.builder().email(email).password(password).build();
        logrUserRepository.findByEmail(email).ifPresentOrElse(logrUser -> {
            log.error("User with email {} already exists", email);
            throw new LogrUserException.UserAlreadyExists(email);
            }, () -> {
            success.set(true);
        });


        log.info("User with email {} created", email);

        return success.get() ? logrUserRepository.save(user).getUserId() : -1L;
    }

    @Override
    public LogrUserDto getUser(Long id) {
        log.info("Getting user with id: {}", id);

        AtomicReference<LogrUserDto> logrUserDto = new AtomicReference<>();

        logrUserRepository.findById(id).ifPresentOrElse(
                logrUser -> {
                    log.info("User with id {} found", id);
                    logrUserDto.set(logrUserMapper.mapLogrUserToDto(logrUser));
                },
                () -> {
                    log.error("User with id {} not found", id);
                    throw new LogrUserException.UserNotFound(id);
                }
        );
        return logrUserDto.get();
    }

    @Override
    public LogrUserDto getUser(String email) {
        log.info("Getting user with username: {}", email);

        AtomicReference<LogrUserDto> logrUserDto = new AtomicReference<>();
        logrUserRepository.findByEmail(email).ifPresentOrElse(
                logrUser -> {
                    log.info("User with username {} found", email);
                    logrUserDto.set(logrUserMapper.mapLogrUserToDto(logrUser));
                },
                () -> {
                    log.error("User with username {} not found", email);
                    throw new LogrUserException.UserNotFound(email);
                }
        );
        return logrUserDto.get();
    }

    @Override
    public boolean deleteUser(Long id) {
        log.info("Deleting user with id: {}", id);
        AtomicBoolean success = new AtomicBoolean(false);
        logrUserRepository.findById(id).ifPresentOrElse(
                logrUser -> {
                    log.info("User with id {} found", id);
                    logrUserRepository.delete(logrUser);
                    success.set(true);
                },
                () -> {
                    log.error("User with id {} not found", id);
                    throw new LogrUserException.UserNotFound(id);
                }
        );
        return success.get();
    }

    @Override
    public boolean deleteUser(String username) {
        log.info("Deleting user with username: {}", username);

        AtomicBoolean success = new AtomicBoolean(false);
        logrUserRepository.findByEmail(username).ifPresentOrElse(
                logrUser -> {
                    log.info("User with username {} found", username);
                    logrUserRepository.delete(logrUser);
                    success.set(true);
                },
                () -> {
                    log.error("User with username {} not found", username);
                    throw new LogrUserException.UserNotFound(username);
                }
        );
        return success.get();
    }

    @Override
    public boolean updateUser(LogrUserDto user) {
        log.info("Updating user with id: {}", user.getUserId());

        AtomicBoolean success = new AtomicBoolean(false);
        logrUserRepository.findById(user.getUserId()).ifPresentOrElse(
                logrUser -> {
                    log.info("User with id {} found", user.getUserId());
                    if(user.getEmail() != null) {
                        logrUser.setEmail(user.getEmail());
                    }
                    if(user.getPassword() != null) {
                        logrUser.setPassword(user.getPassword());
                    }
                    logrUserRepository.save(logrUser);
                },
                () -> {
                    log.error("User with id {} not found", user.getUserId());
                    throw new LogrUserException.UserNotFound(user.getUserId());
                }
        );
        return success.get();
    }
}
