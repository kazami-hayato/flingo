package com.uvt.flingo.common;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class Response {

    private Integer status;
    private String Message;
    private Object data;
}
