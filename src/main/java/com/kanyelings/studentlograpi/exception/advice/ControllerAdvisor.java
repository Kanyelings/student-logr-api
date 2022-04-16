package com.kanyelings.studentlograpi.exception.advice;

import com.kanyelings.studentlograpi.exception.LogrUserException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
    @ExceptionHandler(LogrUserException.UserAlreadyExists.class)
    public ResponseEntity<?> handleUserAlreadyExists(LogrException e) {
        ErrorResponse errorResponse = buildErrorResponse(e);
        return new ResponseEntity<>(errorResponse, errorResponse.getCode());
    }

    @ExceptionHandler(LogrUserException.UserNotFound.class)
    public ResponseEntity<?> handleUserNotFound(LogrUserException.UserNotFound e) {
        ErrorResponse errorResponse = buildErrorResponse(e);
        return new ResponseEntity<>(errorResponse, errorResponse.getCode());
    }

    private ErrorResponse buildErrorResponse(LogrException e) {
        return ErrorResponse.builder()
                .message(e.getMessage())
                .code(e.getCode())
                .success(false)
                .path(e.getPath())
                .build();
    }
}
