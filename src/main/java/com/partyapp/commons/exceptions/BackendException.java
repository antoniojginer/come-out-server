package com.partyapp.commons.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

public class BackendException extends RuntimeException {

    private BackendExceptionCode backendExceptionCode;
    private Map<String, String> extraData;

    public BackendException(BackendExceptionCode backendExceptionCode) {
        super(backendExceptionCode.getMessage());
        this.backendExceptionCode = backendExceptionCode;
    }
}
