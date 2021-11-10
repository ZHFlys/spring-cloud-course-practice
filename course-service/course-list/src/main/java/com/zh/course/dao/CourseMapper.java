package com.zh.course.dao;

import com.zh.course.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author ：郑小浩
 * @description：Course表Mapper
 * @date ：2021/11/10 下午 19:40
 */

@Mapper
@Repository
public interface CourseMapper {

    @Select("select * from course where valid=1")
    /**
     * 查询获取表Course集合
     *
     * @return List<Course>集合
     */
    List<Course> findValidCourses();

}
