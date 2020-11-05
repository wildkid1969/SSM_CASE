package com.wildkid.serviceImpl;

import com.wildkid.dao.CourseOrderMapper;
import com.wildkid.model.CourseOrder;
import com.wildkid.service.CourseOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: mengya
 * @Date: 2020-09-25 17:30
 */
@Service("courseOrderService")
public class CourseOrderServiceImpl implements CourseOrderService {
    @Resource
    private CourseOrderMapper courseOrderMapper;

    @Override
    public List<CourseOrder> getCourseOrderListByParam(CourseOrder order) {
        return courseOrderMapper.getCourseOrderListByParam(order);
    }

    @Override
    public List<CourseOrder> getCourseOrderDetailListByParam(CourseOrder order) {
        return courseOrderMapper.getCourseOrderDetailListByParam(order);
    }

    @Override
    public List<CourseOrder> getCourseOrderDetailListByOrderId(CourseOrder order) {
        return courseOrderMapper.getCourseOrderDetailListByOrderId(order);
    }
}
