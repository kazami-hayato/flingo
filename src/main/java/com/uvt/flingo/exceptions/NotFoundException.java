package com.uvt.flingo.exceptions;

public class NotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;


    public NotFoundException() {
        super();
    }

    public NotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(Throwable throwable) {
        super(throwable);
    }
}
