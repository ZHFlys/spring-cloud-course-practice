package com.zh.course.service.impl;

import com.zh.course.dao.CourseMapper;
import com.zh.course.entity.Course;
import com.zh.course.service.CourseListServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：郑小浩
 * @description：TODO
 * @date ：2021/11/10 下午 19:40
 */

@Service
public class CourseListServiseImpl implements CourseListServise {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> getCourseList() {
        List<Course> validCourses = courseMapper.findValidCourses();
        return validCourses;
    }

}
