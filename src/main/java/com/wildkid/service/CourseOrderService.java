package com.wildkid.service;

import com.wildkid.model.CourseOrder;

import java.util.List;

/**
 * @Author: mengya
 * @Date: 2020-09-25 17:27
 */
public interface CourseOrderService {
    List<CourseOrder> getCourseOrderListByParam(CourseOrder order);
    List<CourseOrder> getCourseOrderDetailListByParam(CourseOrder order);
}
