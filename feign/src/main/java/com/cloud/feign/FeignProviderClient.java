package com.cloud.feign;

import com.cloud.entity.Student;
import com.cloud.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * 创建声明式接⼝
 * 创建 FeignProviderClient 接⼝的实现类 FeignError，定义容错处理逻辑，通过 @Component 注
 * 解将 FeignError 实例注⼊ IoC 容器中。
 * fallback = FeignError.class 如果出错就将跳转FeignError对应方法
 */
@FeignClient(value = "provider2",fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public  String index();
}
