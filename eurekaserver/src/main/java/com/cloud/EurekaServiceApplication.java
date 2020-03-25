package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *分布式、集群
 * 集群：
 * ⼀台服务器⽆法负荷⾼并发的数据访问量，那么就设置⼗台服务器⼀起分担压⼒，⼗台不⾏就设
 * 置⼀百台（物理层⾯）。很多⼈⼲同⼀件事情，来分摊压⼒。
 *
 * 分布式：
 * 将⼀个复杂问题拆分成若⼲个简单的⼩问题，将⼀个⼤型的项⽬架构拆分成若⼲个微服务来协
 * 同完成。（软件设计层⾯）。将⼀个庞⼤的⼯作拆分成若⼲个⼩步骤，分别由不同的⼈完成这些⼩步
 * 骤，最终将所有的结果进⾏整合实现⼤的需求。
 *
 * 服务治理的核⼼⼜三部分组成：服务提供者、服务消费者、注册中⼼。
 * 在分布式系统架构中，每个微服务在启动时，将⾃⼰的信息存储在注册中⼼，叫做服务注册。
 * 服务消费者从注册中⼼获取服务提供者的⽹络信息，通过该信息调⽤服务，叫做服务发现。
 * Spring Cloud 的服务治理使⽤ Eureka 来实现，Eureka 是 Netflix 开源的基于 REST 的服务治理解决⽅
 * 案，Spring Cloud 集成了 Eureka，提供服务注册和服务发现的功能，可以和基于 Spring Boot 搭建的
 * 微服务应⽤轻松完成整合，开箱即⽤，Spring Cloud Eureka。
 *
 * Eureka Server，注册中⼼
 * Eureka Client，所有要进⾏注册的微服务通过 Eureka Client 连接到 Eureka Server，完成注册
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class,args);
    }
}
