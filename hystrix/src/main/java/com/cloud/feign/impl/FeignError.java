package com.cloud.feign.impl;

import com.cloud.entity.Student;
import com.cloud.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    public Collection<Student> findAll() {
        return null;
    }

    public String index() {
        return "服务器维护中。。。";
    }

    @Override
    public Student findById(long id) {
        return  new Student(id,"没有找到改id的值",0);
    }
}
