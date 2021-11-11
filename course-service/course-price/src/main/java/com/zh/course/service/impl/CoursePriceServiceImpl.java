package com.zh.course.service.impl;

import com.zh.course.dao.CoursePriceMapper;
import com.zh.course.entity.CoursePrice;
import com.zh.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：郑小浩
 * @description：TODO
 * @date ：2021/11/10 下午 20:55
 */

@Service
public class CoursePriceServiceImpl implements CoursePriceService {

    @Autowired
    CoursePriceMapper coursePriceMapperl;

    @Override
    public CoursePrice getCoursePrice(Integer courseId) {
        return coursePriceMapperl.findCoursePrice(courseId);
    }
}
