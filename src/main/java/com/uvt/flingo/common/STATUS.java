package com.uvt.flingo.common;

import lombok.Data;
import lombok.val;
public enum STATUS {
    SUCCESS(20000,"请求成功"),
    BAD_REQUEST(400,"错误请求"),
    FORBIDDEN(403,"禁止请求"),
    NOT_FOUND(404,"请求不存在"),
    INTERNAL_SERVER_ERROR(500,"内部错误");

    STATUS(Integer value,String message) {
        this.value=value;
        this.message=message;
    }
    public int getCode(){
        return this.value;
    }
    private Integer value;
    private String message;
}
