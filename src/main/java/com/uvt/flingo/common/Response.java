package com.uvt.flingo.common;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class Response {

    private STATUS Code;
    private String Message;
    private Object data;

}
