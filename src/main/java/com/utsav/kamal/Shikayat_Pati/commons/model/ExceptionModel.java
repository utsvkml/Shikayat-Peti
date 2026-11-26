package com.utsav.kamal.Shikayat_Pati.commons.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ExceptionModel {
    private String message;
    private Integer statusCode;
    private String path;
    private LocalDateTime timeStamp;
}
