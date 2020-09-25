package com.wildkid.controller;

import com.wildkid.utils.ResultData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: mengya
 * @Date: 2020-09-25 15:43
 */
@RestController
@RequestMapping(value = "common")
public class CommonController {

    @RequestMapping(value = "/")
    public ResultData index(){

        return ResultData.successed("hi");
    }
}
