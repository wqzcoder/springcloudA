package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import javax.swing.*;

/**
 * @author wangqingze
 * @creat 2020-06-29-17:18
 */
@EnableZuulProxy
@EnableAutoConfiguration//自动装载的方式
public class ZuulDemo {
    public static void main(String[] args) {
        SpringApplication.run(ZuulDemo.class, args);
    }
}
