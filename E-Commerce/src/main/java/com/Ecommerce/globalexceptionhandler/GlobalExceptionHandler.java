package com.Ecommerce.globalexceptionhandler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Ecommerce.model.Admin;


@RestControllerAdvice
@Component
public class GlobalExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<Admin> GlobalExceptionHandler(MissingPathVariableException e){
		
		e.getMessage();
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
}
   
