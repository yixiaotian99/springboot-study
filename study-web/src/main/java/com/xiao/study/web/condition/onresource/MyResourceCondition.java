package com.xiao.study.web.condition.onresource;


import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 23:00
 * @Description TODO
 **/
@Component
public class MyResourceCondition {


    /**
     * 当 classpath 下存在指定资源文件时才注入
     */
    @Bean
    @ConditionalOnResource(resources = {"classpath:abc.txt"})
    public UserService5 userService5() {
        return new UserService5();
    }

}
