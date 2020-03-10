package com.uvt.flingo.controllers;

import com.uvt.flingo.common.Response;
import com.uvt.flingo.common.STATUS;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/apis/v2/hello", produces = "application/json; charset=utf-8")
public class HelloController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Response greeting() {
        return Response.builder().status(STATUS.SUCCESS.getCode())
                .data(User.builder().username("lk").build())
                .build();
    }
}
