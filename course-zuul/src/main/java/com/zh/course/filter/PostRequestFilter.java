package com.zh.course.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @author ：郑小浩
 * @description：请求处理后的过滤器
 * @date ：2021/11/11 下午 18:57
 */

@Component
public class PostRequestFilter extends ZuulFilter {

    //过滤器的类型
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER - 1;
    }


    /**
     * 是否要启用，可以用来判断URL之类的来动态启用
     *
     * @return 是否要启用
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        Long startTime = (Long) currentContext.get("startTime");
        long duration = System.currentTimeMillis() - startTime;
        String requestURI = currentContext.getRequest().getRequestURI();

        System.out.println(String.format("请求地址：%s，请求处理时间：%s", requestURI,duration));
        return null;
    }
}
