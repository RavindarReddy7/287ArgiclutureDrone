package com.drone.agriDrone.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class DroneExceptionHandler extends ResponseEntityExceptionHandler {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(DroneExceptionHandler.class);

	
	/*
	 * @ExceptionHandler(value = { MethodArgumentNotValidException.class }) public
	 * ResponseEntity<Object>
	 * handleInvalidInputException(MethodArgumentNotValidException ex) {
	 * 
	 * logger.error("Invalid Input Exception: ",ex.getMessage());
	 * 
	 * return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	 * 
	 * }
	 */
	 
	//@Override
//	 protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, 
//			  HttpHeaders headers, HttpStatus status, WebRequest request) {
//	    List<String> details = new ArrayList<>();
//	    for(ObjectError error : ex.getBindingResult().getAllErrors()) {
//	      details.add(error.getDefaultMessage());
//	    }
//	  //ErrorResponse error = new ErrorResponse("Validation Failed", details);
//	    return new ResponseEntity<Object>("validation failed "+ details, HttpStatus.BAD_REQUEST);
//	  }
	/*
	 * @ExceptionHandler(value = { Unauthorized.class })
	 * 
	 * public ResponseEntity<Object> handleUnauthorizedException(Unauthorized ex) {
	 * 
	 * LOGGER.error("Unauthorized Exception: ",ex.getMessage());
	 * 
	 * return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	 * 
	 * }
	 */

	@ExceptionHandler(value = { NoSuchElementException.class })
	public ResponseEntity<Object> handleBusinessException(NoSuchElementException ex) {


		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(value = { DroneBusinessException.class })
	public ResponseEntity<Object> handleBusinessException(DroneBusinessException ex) {

		logger.error("Business Exception:  "+ ex.getMessage(), ex.getMessage());

		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.BAD_REQUEST);

	}
	
//	@Override
//	 public ResponseEntity<Object> handleMethodArgumentNotValid(
//	            MethodArgumentNotValidException ex,
//	            HttpHeaders headers, HttpStatus status, WebRequest request) {
//	             
//	        Map<String, Object> responseBody = new LinkedHashMap<>();
//	        responseBody.put("timestamp", new Date());
//	        responseBody.put("status", status.value());
//	         
//	        List<String> errors = ex.getBindingResult().getFieldErrors()
//	            .stream()
//	            .map(x -> x.getDefaultMessage())
//	            .collect(Collectors.toList());
//	         
//	        responseBody.put("errors", errors);
//	         
//	        return new ResponseEntity<>(responseBody, headers, status);
//	    }

	
	 @ExceptionHandler(value = { Exception.class })
	 
	 public ResponseEntity<Object> handleException(Exception ex) {
	 
		 logger.error("Exception: ",ex.getMessage());
	  
	  return new
	  ResponseEntity<Object>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	  
	  }
	 
	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	
public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
	  Map<String, String> errors = new HashMap<>();
	  ex.getBindingResult().getAllErrors().forEach((error) -> { 
//		   String fieldName
//	  =  error.getCode(); 
		   String errorMessage =
	  error.getDefaultMessage(); errors.put("fieldName", errorMessage); }); return
	  errors; }
	 

}
