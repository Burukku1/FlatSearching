package com.example.exceptionhandler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        // Ваша логика обработки ошибок и формирования ответа
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("govno");
    }
}