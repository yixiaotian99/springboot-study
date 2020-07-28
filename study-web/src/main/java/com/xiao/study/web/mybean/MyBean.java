package com.xiao.study.web.mybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 22:09
 * @Description 创建一个spring bean
 **/
@Configuration
public class MyBean {


    @Bean
    public Object personService(){
        return new PersonService();
    }


    public Object personService2(){
        return new PersonService();
    }
}
