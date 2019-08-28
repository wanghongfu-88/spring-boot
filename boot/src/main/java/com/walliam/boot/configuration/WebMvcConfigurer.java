package com.walliam.boot.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 编写拦截器配置文件主类 WebMvcConfigurer
 * 此类必须继承  WebMvcConfigurerAdapter 类，并重写其中的方法
 * addInterceptors（将自定义的拦截器注册到拦截器注册服务里面）   并且在主类上加上注解
 * @Configuration
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {
    @Autowired
    private MyInterceptor myInterceptor;

    /**
     * <p>Title:</p>
     * <p>Description:重写增加自定义拦截器的注册，某一个拦截器需要先注册进来，才能工作</p>
     * param[1]: null
     * return:
     * exception:
     **/
     @Override
     public void addInterceptors(InterceptorRegistry registry) {
         registry.addInterceptor(myInterceptor).addPathPatterns("/hello/*","/auth/*");

          //注册别的拦截器
         //registry.addInterceptor(myInterceptor1).addPathPatterns("/hello/*","/auth/*").excludePathPatterns("hello/1");
         //registry.addInterceptor(uriInterceptor()).addPathPatterns("/**");
         super.addInterceptors(registry);
     }
}
