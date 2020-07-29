package com.xiao.study.web.condition.onspel;


import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 23:00
 * @Description TODO
 **/
@Configuration
public class MySpelCondition {


    /**
     * 检测 spel 表示式的结果，只有判断结果返回 true 才返回
     */
    @Bean
    @ConditionalOnExpression("#{'enabled'.equals(environment['conditional.express'])}")
    public UserService6 userService6() {
        return new UserService6();
    }

}
