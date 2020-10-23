package com.wildkid.dao;

import com.wildkid.model.CourseOrder;

import java.util.List;

/**
 * @Author: mengya
 * @Date: 2020-09-25 17:31
 */
public interface CourseOrderMapper {
    List<CourseOrder> getCourseOrderListByParam(CourseOrder order);
    List<CourseOrder> getCourseOrderDetailListByParam(CourseOrder order);
}
