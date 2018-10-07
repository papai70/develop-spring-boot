package com;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class Handler extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler
	public String handle(ApplicationException ex){
		
		if(ex instanceof ApplicationException){
			String s=ex.getMessage();
			return s;
			
		}
			return "other";
	}

}
