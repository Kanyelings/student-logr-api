package com.kanyelings.studentlograpi.exception.advice;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponse {
    private String path;
    private String message;
    private HttpStatus code;
    private Boolean success;
}
