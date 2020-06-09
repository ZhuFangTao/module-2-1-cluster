package com.lagou.springcluster.config;

import com.lagou.springcluster.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * \* User: ZhuFangTao
 * \* Date: 2020/3/17 11:08 上午
 * \
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Autowired
    private MyInterceptor myInterceptor;

    /**
     * 添加自定义拦截器
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor)
                .addPathPatterns("/**");
        super.addInterceptors(registry);
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/user/**")
//                .addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/login/");

        registry.addResourceHandler("/static/**")
                .addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
        super.addResourceHandlers(registry);
    }
}