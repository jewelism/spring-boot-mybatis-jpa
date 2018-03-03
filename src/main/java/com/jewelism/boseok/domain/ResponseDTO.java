package com.jewelism.boseok.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseDTO {
    private Status status;
    private boolean bool;

    enum Status {
        SUCCESS,
        FAIL
    }

    public static ResponseDTO ofSuccess() {
        return ResponseDTO.builder()
                .status(Status.SUCCESS)
                .bool(true)
                .build();
    }

    public static ResponseDTO ofFail() {
        return ResponseDTO.builder()
                .status(Status.FAIL)
                .bool(false)
                .build();
    }
}
