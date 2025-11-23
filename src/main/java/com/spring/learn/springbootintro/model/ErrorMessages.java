package com.spring.learn.springbootintro.model;

import org.eclipse.jetty.http.HttpStatus;

public class ErrorMessages {
    private HttpStatus status;
    private String message;

    public ErrorMessages(String message) {
        this.message = message;
    }

    public ErrorMessages(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public ErrorMessages(org.springframework.http.HttpStatus httpStatus, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
