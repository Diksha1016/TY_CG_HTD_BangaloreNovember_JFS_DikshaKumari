package com.capgemini.empspringboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.empspringboot.dto.EmployeeResponse;
import com.capgemini.empspringboot.exception.EmployeeException;

@RestControllerAdvice//handling exception in spring
public class EmployeeControllerAdvice {
	@ExceptionHandler(EmployeeException.class)
    public EmployeeResponse handleEmployeeException (EmployeeException e) {
	EmployeeResponse employeeResponse =  new EmployeeResponse();
	employeeResponse.setStatusCode(501);
	employeeResponse.setMessage("Exception");
	employeeResponse.setDescription(e.getMessage());
	return employeeResponse;
}
}
