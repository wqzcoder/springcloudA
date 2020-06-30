package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangqingze
 * @creat 2020-06-29-18:49
 */
@SpringBootApplication
public class RibbonDemo {
    public static void main(String[] args) {

        SpringApplication.run(RibbonDemo.class, args);

    }

    @Bean
    @LoadBalanced//负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
