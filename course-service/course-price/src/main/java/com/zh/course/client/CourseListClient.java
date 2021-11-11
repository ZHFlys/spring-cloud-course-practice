package com.zh.course.client;

import com.zh.course.entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author ：郑小浩
 * @description：课程列表的Feign客户端
 * @date ：2021/11/11 下午 17:23
 */

@Primary
@FeignClient(value = "course-list", fallback = CourseListClientHystrix.class)
public interface CourseListClient {
    @GetMapping("/courses")
    public List<Course> courseList();
}
