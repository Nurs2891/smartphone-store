package com.example.smartphonestore.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ApiExceptionResponse {

    private String massage;

    private HttpStatus status;

    private LocalDateTime timestamp;
}
