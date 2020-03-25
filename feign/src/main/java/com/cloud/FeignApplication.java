package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 什么是 Feign？
 * 与 Ribbon ⼀样，Feign 也是由 Netflix 提供的，Feign 是⼀个声明式、模版化的 Web Service 客户端，
 * 它简化了开发者编写 Web 服务客户端的操作，开发者可以通过简单的接⼝和注解来调⽤ HTTP API，
 * Spring Cloud Feign，它整合了 Ribbon 和 Hystrix，具有可插拔、基于注解、负载均衡、服务熔断等⼀
 * 系列便捷功能。
 * 相⽐较于 Ribbon + RestTemplate 的⽅式，Feign ⼤⼤简化了代码的开发，Feign ⽀持多种注解，包括
 * Feign 注解、JAX-RS 注解、Spring MVC 注解等，Spring Cloud 对 Feing 进⾏了优化，整合了 Ribbon
 * 和 Eureka，从⽽让 Feign 的使⽤更加⽅便。
 * Ribbon 和 Feign 的区别
 * Ribbon 是⼀个通⽤的 HTTP 客户端⼯具，Feign 是基于 Ribbon 实现的。
 * Feign 的tedian
 * 1、Feign 是⼀个声明式的 Web Service 客户端。
 * 2、⽀持 Feign 注解、Spring MVC 注解、JAX-RS 注解。
 * 3、Feign 基于 Ribbon 实现，使⽤起来更加简单。
 * 4、Feign 集成了 Hystrix，具备服务熔断的功能。
 */
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
