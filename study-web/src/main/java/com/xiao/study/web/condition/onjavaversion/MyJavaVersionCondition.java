package com.xiao.study.web.condition.onjavaversion;


import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 23:00
 * @Description TODO
 **/
@Configuration
public class MyJavaVersionCondition {


    /**
     * 检查java的版本
     */
    @Bean
    @ConditionalOnJava(JavaVersion.ELEVEN)
    public UserService7 userService7() {
        return new UserService7();
    }

}
