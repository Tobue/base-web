package com.awesome.avenger.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwei
 * @version 1.0
 * @date 2020/2/11 04:01
 */
@RestController
@RequestMapping("/api/index")
public class IndexController {

    @ApiOperation(value = "index")
    @GetMapping("index")
    public String hole(){
        return "复仇者联盟";
    }
}
