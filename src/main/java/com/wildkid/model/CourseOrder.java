package com.wildkid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: mengya
 * @Date: 2020-09-25 16:51
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CourseOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    //主键
    private Integer id;
    //机构Id
    private Integer insId;
    //订单Id
    private String orderId;
    //课程Id
    private Integer courseId;
    //部门Id
    private Integer departmentId;
    //订单状态 0 无效 1 普通订单 2 后台补报订单 3 用户已取消订单
    private Integer status;
    //优惠了的金额
    private Double preferencePrice;
    //实付金额
    private Double cost;
    //更新时间
    private Date updateTime;
    //创建时间
    private Date createTime;
    //报名操作人Id
    private Integer operatorUserId;
    //报名来源
    private Integer source;
    //订单确收状态 0:未确收 1:已确收
    private Integer confirmIncomeStatus;

}
