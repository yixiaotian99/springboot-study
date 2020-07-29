package com.xiao.study.web.condition.onproperty;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 23:00
 * @Description TODO
 **/
@Component
public class MyPropertyCondition {


    @Value("${test.num}")
    private String name;


    /**
     * 当 yml 文件中存在 test.name=abc 时才注入
     */
    @Bean
    @ConditionalOnProperty(value = "test.num", havingValue = "abc")
    public UserService4 userService4() {
        return new UserService4();
    }

}
