package com.zh.course;

import com.zh.entity.CoursePrice;
import com.zh.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：郑小浩
 * @description：课程价格控制器
 * @date ：2021/11/10 下午 20:47
 */
@RestController
public class CoursePriceController {

    @Autowired
    CoursePriceService coursePriceService;

    @GetMapping("/price")
    public Integer getCoursePrice(Integer courseId){
        CoursePrice coursePrice = coursePriceService.getCoursePrice(courseId);
        return coursePrice.getPrice();
    }

}
