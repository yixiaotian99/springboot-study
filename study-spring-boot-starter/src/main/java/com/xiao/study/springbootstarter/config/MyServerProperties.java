package com.xiao.study.springbootstarter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author sunjinwei
 * @Date 2020-07-30 17:21
 * @Description 我的服务器配置信息
 **/
@Data
@ConfigurationProperties(prefix = "myserver")
public class MyServerProperties {


    private String name;

    private Integer port = 8080;

}
