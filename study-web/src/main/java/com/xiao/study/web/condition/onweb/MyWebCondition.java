package com.xiao.study.web.condition.onweb;


import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 23:00
 * @Description TODO
 **/
@Configuration
public class MyWebCondition {


    /**
     * 是否是web项目
     */
    @Bean
    @ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.REACTIVE)
    public UserService8 userService8() {
        return new UserService8();
    }

}
