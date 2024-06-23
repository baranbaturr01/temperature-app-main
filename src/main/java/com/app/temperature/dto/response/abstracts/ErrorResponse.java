package com.app.temperature.dto.response.abstracts;

import com.app.temperature.dto.response.ResponseStatus;

import java.util.Locale;

public abstract class ErrorResponse extends BaseResponse{

    public ErrorResponse() {
        status = ResponseStatus.FAILURE.toString().toLowerCase(Locale.ENGLISH);
    }
}
