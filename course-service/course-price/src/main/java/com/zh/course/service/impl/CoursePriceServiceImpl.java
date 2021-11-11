package com.zh.course.service.impl;

import com.zh.course.client.CourseListClient;
import com.zh.course.dao.CoursePriceMapper;
import com.zh.course.entity.Course;
import com.zh.course.entity.CourseAndPrice;
import com.zh.course.entity.CoursePrice;
import com.zh.course.service.CoursePriceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：郑小浩
 * @description：TODO
 * @date ：2021/11/10 下午 20:55
 */

@Service
public class CoursePriceServiceImpl implements CoursePriceService {

    @Autowired
    CoursePriceMapper coursePriceMapperl;

    @Autowired
    CourseListClient courseListClient;

    @Override
    public CoursePrice getCoursePrice(Integer courseId) {
        return coursePriceMapperl.findCoursePrice(courseId);
    }

    @Override
    public List<CourseAndPrice> getCourseAndPrice(){
        List<CourseAndPrice> courseAndPrices = new ArrayList<>();
        List<Course> courses = courseListClient.courseList();
        courses.forEach(course -> {
            CourseAndPrice courseAndPrice = new CourseAndPrice();
            BeanUtils.copyProperties(course, courseAndPrice);
            CoursePrice coursePrice = getCoursePrice(course.getCourseId());
            courseAndPrice.setPrice(coursePrice.getPrice());
            courseAndPrices.add(courseAndPrice);
        });
        return courseAndPrices;
    }
}
