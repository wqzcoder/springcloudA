package com.wang.controller;

import com.wang.enti.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author wangqingze
 * @creat 2020-06-29-18:52
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return  restTemplate.getForObject("http://provider/student/findAll",Collection.class);

    }

    public String index(){
        return  restTemplate.getForObject("http://provider/student/index", String.class);
    }


}
