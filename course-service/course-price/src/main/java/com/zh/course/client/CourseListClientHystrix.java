package com.zh.course.client;

import com.zh.course.entity.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：郑小浩
 * @description：断路器实现类
 * @date ：2021/11/11 下午 17:45
 */

@Component
public class CourseListClientHystrix implements CourseListClient{

    @Override
    public List<Course> courseList() {
        List<Course> defaultCourses = new ArrayList<>();
        Course course = new Course();
        course.setCourseId(1);
        course.setId(1);
        course.setValid(1);
        course.setCourseName("默认课程");
        defaultCourses.add(course);
        return defaultCourses;
    }
}
