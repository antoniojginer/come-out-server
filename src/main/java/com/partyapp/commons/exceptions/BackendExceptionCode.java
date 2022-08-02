package com.partyapp.commons.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public enum BackendExceptionCode {
    EVENT__CONVENTION_DETAIL__NOT_FOUND(
            HttpStatus.NOT_FOUND,
            "Convention event not found",
            "00001"
    ),
    EVENT__CONVENTION_DETAIL__INTERNAL_ERROR(
            HttpStatus.INTERNAL_SERVER_ERROR,
            "Error retrieving convention event detail",
            "00001"
    );

    @Getter
    HttpStatus status;
    @Getter
    String message;
    @Getter
    String errorCode;
}
