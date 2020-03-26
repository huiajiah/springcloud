package com.cloud.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.cloud.entity.Student;
import com.cloud.feign.FeignProviderClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }



    @GetMapping("/index")
    //@HystrixCommand(fallbackMethod = "getFallbackIndex") //使用服务熔断机制，避免服务扇出导致雪崩
    public  String index(){
        return feignProviderClient.index();
    }

    public String getFallbackIndex(){
        return "服务维护中2。。。";
    }

    @GetMapping("/findById/{id}")
    public  Student findById(@PathVariable("id") long id){
        System.out.println("测试 ");
        return feignProviderClient.findById(id);
    }
}
