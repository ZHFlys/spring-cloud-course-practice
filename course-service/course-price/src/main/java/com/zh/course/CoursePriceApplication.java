package com.zh.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：郑小浩
 * @description：价格项目启动类
 * @date ：2021/11/10 下午 21:03
 */

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class CoursePriceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoursePriceApplication.class, args);
    }
}
