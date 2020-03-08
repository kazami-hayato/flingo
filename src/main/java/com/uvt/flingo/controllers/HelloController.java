package com.uvt.flingo.controllers;

import com.uvt.flingo.FlingoApplication;
import com.uvt.flingo.common.Response;
import com.uvt.flingo.common.STATUS;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/apis/v2/hello", produces = "application/json; charset=utf-8")
public class HelloController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Response greeting() {
        var a = Response.builder().Code(STATUS.SUCCESS).build();
        log.info("a new day");
        return a;

    }
}
