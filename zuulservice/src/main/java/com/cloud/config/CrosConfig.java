package com.cloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 处理跨域问题
 * 处理前后端分离跨域问题
 * 如果想要对全部方法allowedMethods("*")
        */
@Configuration
public class CrosConfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")  //允许访问的客户端域名
                .allowedMethods("GET","HEAD","POST","PUT","DELETE") //允许访问的方法名 一般设置为*
                .allowCredentials(true) //是否允许请求带有验证信息
                .maxAge(3600)
                .allowedHeaders("*"); //允许服务端访问的客户端请求头
    }
}
