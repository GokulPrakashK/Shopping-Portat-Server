package com.learning.shoppingportal.modal.io;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseWrapper<L> {

    private boolean success;
    private Object data;

    private String error;

    public ResponseWrapper(boolean success, Object data, String error) {
        this.success = success;
        this.data = data;
        this.error = error;
    }
}
