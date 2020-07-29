package com.xiao.study.web.condition.onclass;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 23:00
 * @Description TODO
 **/
@Component
public class MyClassCondition {


    /**
     * 当类路径下存在 A.class 时执行方法
     */
    @Bean
    @ConditionalOnClass(A3.class)
    public UserService3 userService3() {
        return new UserService3();
    }

}
