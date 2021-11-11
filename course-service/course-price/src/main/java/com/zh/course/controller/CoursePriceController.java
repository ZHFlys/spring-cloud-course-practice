package com.zh.course.controller;

import com.zh.course.client.CourseListClient;
import com.zh.course.entity.Course;
import com.zh.course.entity.CoursePrice;
import com.zh.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：郑小浩
 * @description：课程价格控制器
 * @date ：2021/11/10 下午 20:47
 */
@RestController
public class CoursePriceController {

    @Autowired
    CoursePriceService coursePriceService;

    @Autowired
    CourseListClient courseListClient;

    @GetMapping("/price")
    public Integer getCoursePrice(Integer courseId){
        CoursePrice coursePrice = coursePriceService.getCoursePrice(courseId);
        return coursePrice.getPrice();
    }

    @GetMapping("/coursesInPrice")
    public List<Course> getCoursePrice(){
        List<Course> courses = courseListClient.courseList();
        return courses;
    }
}
