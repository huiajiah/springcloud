package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul 是 Netflix 提供的⼀个开源的 API ⽹关服务器，是客户端和⽹站后端所有请求的中间层，对外开放
 * ⼀个 API，将所有请求导⼊统⼀的⼊⼝，屏蔽了服务端的具体实现逻辑，Zuul 可以实现反向代理的功
 * 能，在⽹关内部实现动态路由、身份认证、IP 过滤、数据监控等。
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
