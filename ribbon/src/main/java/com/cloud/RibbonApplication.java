package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Spring Cloud Ribbon 是⼀个负载均衡解决⽅案，Ribbon 是 Netflix 发布的负载均衡器，Spring Cloud
 * Ribbon 是基于 Netflix Ribbon 实现的，是⼀个⽤于对 HTTP 请求进⾏控制的负载均衡客户端。
 * 在注册中⼼对 Ribbon 进⾏注册之后，Ribbon 就可以基于某种负载均衡算法，如轮询、随机、加权轮
 * 询、加权随机等⾃动帮助服务消费者调⽤接⼝，开发者也可以根据具体需求⾃定义 Ribbon 负载均衡算
 * 法。实际开发中，Spring Cloud Ribbon 需要结合 Spring Cloud Eureka 来使⽤，Eureka Server 提供
 * 所有可以调⽤的服务提供者列表，Ribbon 基于特定的负载均衡算法从这些服务提供者中选择要调⽤的
 * 具体实例
 */
@SpringBootApplication
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class,args);
    }

    @Bean  //注入spring ioc容器
    @LoadBalanced   //ribbon 使用该注解进行客户端请求负载均衡
    public  RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
