package com.FeignImp;

import com.wang.enty.Student;
import com.wang.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author wangqingze
 * @creat 2020-06-29-21:57
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中！ ";
    }
}
