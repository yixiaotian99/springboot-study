package com.xiao.study.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 22:31
 * @Description TODO
 **/
@Configuration
@ComponentScan("com.xiao.study.web")
//@PropertySource("classpath:application.yml")
public class AppConfig {


//    @Bean
//    public static PropertySourcesPlaceholderConfigurer
//    propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }


}
