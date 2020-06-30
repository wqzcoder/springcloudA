package com.wang.ProvideApplcation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangqingze
 * @creat 2020-06-27-18:24
 */
@SpringBootApplication
public class Provider {

    public static void main(String[] args) {

        SpringApplication.run(Provider.class, args);

    }

}
