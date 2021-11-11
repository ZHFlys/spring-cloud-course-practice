package com.zh.course.service;

import com.zh.course.entity.CoursePrice;

/**
 * @author ：郑小浩
 * @description：课程价格服务
 * @date ：2021/11/10 下午 20:50
 */

public interface CoursePriceService {

    /**
     * 获取商品价格
     *
     * @param courseId 课程id
     * @return CoursePrice
     */
    CoursePrice getCoursePrice(Integer courseId);
}
