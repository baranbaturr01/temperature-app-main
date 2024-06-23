package com.app.temperature.dto.response.abstracts;

import com.app.temperature.dto.response.ResponseStatus;

import java.util.Locale;

public abstract class SuccessResponse extends BaseResponse{

    public SuccessResponse() {
        status = ResponseStatus.SUCCESS.toString().toLowerCase(Locale.ENGLISH);
    }
}
