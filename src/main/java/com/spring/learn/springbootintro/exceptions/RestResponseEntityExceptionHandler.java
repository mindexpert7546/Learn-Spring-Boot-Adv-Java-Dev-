package com.spring.learn.springbootintro.exceptions;

import com.spring.learn.springbootintro.model.ErrorMessages;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler
extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessages employeeNotFoundHandler(EmployeeNotFoundException e){
        ErrorMessages errorMessages = new ErrorMessages(HttpStatus.NOT_FOUND, e.getMessage());
        return errorMessages;
    }
}
