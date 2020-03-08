package com.uvt.flingo.exceptionHandler;

import com.uvt.flingo.common.Response;
import com.uvt.flingo.common.STATUS;
import com.uvt.flingo.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class FlingoHandler {
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = NotFoundException.class)
    public Response handleNotFound(HttpServletRequest request, NotFoundException e) throws Exception {
        return Response.builder().Code(STATUS.NOT_FOUND).build();
    }
}
