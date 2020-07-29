package com.xiao.study.web.condition.onbean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 23:00
 * @Description TODO
 **/
@Component
public class MyBeanCondition {


    /**
     * 当容器中存在 A.class 时执行方法
     */
    @Bean
    @ConditionalOnBean(A.class)
    public UserService userService() {
        return new UserService();
    }

}
