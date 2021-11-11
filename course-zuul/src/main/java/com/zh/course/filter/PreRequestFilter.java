package com.zh.course.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @author ：郑小浩
 * @description：记录请求时间，请求处理前
 * @date ：2021/11/11 下午 18:52
 */

@Component
public class PreRequestFilter extends ZuulFilter {

    //过滤器的类型
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
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
        currentContext.set("startTime", System.currentTimeMillis());
        System.out.println("过滤器已经记录时间");
        return null;
    }
}
