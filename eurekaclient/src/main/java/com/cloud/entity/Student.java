package com.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //不需要get和set方法
@AllArgsConstructor // 加在类上，可以生成含实体类全参数的构造方法
@NoArgsConstructor  //加在类上，可以生成无参构造方法。
public class Student {
    private long id;
    private String name;
    private int age;

}
