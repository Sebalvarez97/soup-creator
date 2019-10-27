package com.sitrack.soupcreator;

import com.sitrack.soupcreator.entities.ResponseStandard;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;

@ControllerAdvice
public class ExceptionHandlerRestResponse extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResponseError.class)
    protected ResponseEntity<ResponseStandard> handleNotFound(
            ResponseError ex) {
        logger.error(ex);
        ResponseStandard apiError = new ResponseStandard(ex.getErrorDescription(), HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ResponseStandard> handleException(
            Exception ex){
        logger.error(ex);
        ResponseStandard apiError = new ResponseStandard(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ResponseEntity<>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
