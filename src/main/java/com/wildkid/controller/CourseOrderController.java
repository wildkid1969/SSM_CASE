package com.wildkid.controller;

import com.wildkid.model.CourseOrder;
import com.wildkid.service.CourseOrderService;
import com.wildkid.utils.ResultData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: mengya
 * @Date: 2020-09-25 17:26
 */
@RestController
@RequestMapping(value = "courseOrder")
public class CourseOrderController {

    @Resource
    private CourseOrderService courseOrderService;

    /**
     * 获取订单列表
     * @param order
     * @return
     */
    @RequestMapping(value = "getList")
    public ResultData getList(CourseOrder order){
        List<CourseOrder> orderList = courseOrderService.getCOurseOrderListByParam(order);
        return ResultData.successed(orderList);
    }
}
