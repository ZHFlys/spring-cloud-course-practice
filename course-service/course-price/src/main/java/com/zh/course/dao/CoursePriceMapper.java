package com.zh.course.dao;

import com.zh.course.entity.CoursePrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * @author ：郑小浩
 * @description 课程价格表Mapper类
 * @date ：2021/11/10 下午 20:56
 */

@Mapper
@Repository
public interface CoursePriceMapper {

    @Select("select * from course_price where course_id = #{courseId}")
    /**
     * 查询获取CoursePrice
     * @param courseId课程ID
     * @return CoursePrice
     */
    CoursePrice findCoursePrice(Integer courseId);

}
