package com.xiao.study.web.myconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 21:15
 * @Description 读取配置
 **/
@Data
@ConfigurationProperties(prefix = "myserver")
public class ServerProperties {


    private String name;
    private String port;
    private String url;
    private String secure;


}
