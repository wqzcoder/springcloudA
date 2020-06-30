package com.wang.controller;

import com.wang.enty.Student;
import com.wang.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author wangqingze
 * @creat 2020-06-29-21:40
 */
@RestController
@RequestMapping("/feign")
public class Demo {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){

        Collection<Student> all = feignProviderClient.findAll();
        return all;
    }
    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }

}
