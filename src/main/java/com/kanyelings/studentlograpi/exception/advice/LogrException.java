package com.kanyelings.studentlograpi.exception.advice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class LogrException extends RuntimeException{
    private String path;
    private String message;
    private HttpStatus code;
    private Boolean success;

    public LogrException(String message, HttpStatus code, Boolean success) {
        this.path = "/";
        this.message = message;
        this.code = code;
        this.success = success;
    }
}
