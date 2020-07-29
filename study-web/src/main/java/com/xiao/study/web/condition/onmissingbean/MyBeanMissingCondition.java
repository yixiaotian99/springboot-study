package com.xiao.study.web.condition.onmissingbean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 23:00
 * @Description TODO
 **/
@Component
public class MyBeanMissingCondition {


    /**
     * 当容器中存在 A2.class 时执行方法
     */
    @Bean
    @ConditionalOnMissingBean(A2.class)
    public UserService2 userService2() {
        return new UserService2();
    }

}
