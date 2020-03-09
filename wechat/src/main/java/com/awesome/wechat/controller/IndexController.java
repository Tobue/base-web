package com.awesome.wechat.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwei
 */

@RestController
@RequestMapping("/api/index")
public class IndexController {

    @ApiOperation(value = "index")
    @GetMapping("index")
    public String hole(){
        return "index";
    }
}
