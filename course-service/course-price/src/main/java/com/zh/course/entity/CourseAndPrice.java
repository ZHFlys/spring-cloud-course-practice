package com.zh.course.entity;

/**
 * @author ：郑小浩
 * @description：课程与价格的融合类
 * @date ：2021/11/11 下午 17:58
 */

public class CourseAndPrice {
    Integer id;
    Integer courseId;
    String courseName;
    Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
