package com.kanyelings.studentlograpi.exception;

import com.kanyelings.studentlograpi.exception.advice.LogrException;
import org.springframework.http.HttpStatus;

import java.util.function.Supplier;

public class LogrUserException {
    public static class UserAlreadyExists extends LogrException {
        public UserAlreadyExists(String email) {
            super("User with email " + email + " already exists", HttpStatus.CONFLICT, false);
        }
    }
    public static class UserNotFound extends LogrException {
        public UserNotFound(String email) {
            super("User with email " + email + " not found", HttpStatus.NOT_FOUND, false);
        }

        public UserNotFound(Long id) {
            super("User with id " + id + " not found", HttpStatus.NOT_FOUND, false);
        }
    }
}
