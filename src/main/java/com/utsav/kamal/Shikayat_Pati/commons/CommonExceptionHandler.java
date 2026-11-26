package com.utsav.kamal.Shikayat_Pati.commons;

import com.utsav.kamal.Shikayat_Pati.commons.model.ExceptionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpStatusCodeException;

import java.time.LocalDateTime;

@RestControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionModel> runtimeException(RuntimeException exception){

        ExceptionModel exceptionModel = ExceptionModel.builder()
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message(exception.getMessage())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionModel,HttpStatus.INTERNAL_SERVER_ERROR);

    }


}
