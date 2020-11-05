package com.wildkid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: mengya
 * @Date: 2020-10-26 19:14
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Course {
    private Integer id;
    private String name;
    private Integer courseType;
    private Double originalPrice;
    private Integer status;
}
