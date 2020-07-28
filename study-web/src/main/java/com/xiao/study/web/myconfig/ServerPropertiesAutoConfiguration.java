package com.xiao.study.web.myconfig;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 21:20
 * @Description TODO
 **/
@Configuration
@EnableConfigurationProperties(ServerProperties.class)
public class ServerPropertiesAutoConfiguration {
}
