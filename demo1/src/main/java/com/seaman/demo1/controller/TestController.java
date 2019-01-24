package com.seaman.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-01-24 14:02
 * 功能描述:
 * 修改历史:
 */

@RestController
public class TestController {

    @GetMapping("/test1")
    public String test1(){

        return "Hello World!";
    }
}
