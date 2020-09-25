package com.wildkid.controller;

import com.wildkid.utils.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: mengya
 * @Date: 2020-09-25 15:43
 */
@RestController
@RequestMapping(value = "common")
public class CommonController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/")
    public ResultData index(String name){
        logger.info("name:{}", name);

        return ResultData.successed(name);
    }
}
