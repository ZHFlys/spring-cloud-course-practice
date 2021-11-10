package com.zh.course.controller;

import com.zh.course.entity.Course;
import com.zh.course.service.CourseListServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：郑小浩
 * @description：CourseListController课程列表COntroller
 * @date ：2021/11/10 下午 19:30
 */

@RestController
public class CourseListController {
    @Autowired
    CourseListServise courseListServise;

    @GetMapping("/courses")
    public List<Course> courseList(){
        List<Course> courseList = courseListServise.getCourseList();
        return courseList;
    }
}
