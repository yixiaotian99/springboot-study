package com.xiao.study.web.mybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 22:09
 * @Description 创建一个spring bean
 **/
@Configuration
public class MyBean2 {


    /**
     * 只在配置文件是 dev 时进行注入
     * @return
     */
    @Bean
    @Profile("dev")
    public Object personService3(){
        return new PersonService();
    }

}
