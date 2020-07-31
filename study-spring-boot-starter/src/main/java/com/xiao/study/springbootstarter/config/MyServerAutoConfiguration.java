package com.xiao.study.springbootstarter.config;

import com.sun.net.httpserver.HttpServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @Author sunjinwei
 * @Date 2020-07-30 17:22
 * @Description 我的服务器自动配置 配置类
 **/
@Configuration
@EnableConfigurationProperties(MyServerProperties.class)
public class MyServerAutoConfiguration {


    private Logger logger = LoggerFactory.getLogger(MyServerAutoConfiguration.class);


    // 需要项目中存在 com.sun.net.httpserver.HttpServer 类。该类为 JDK 自带，所以一定成立。
    @ConditionalOnClass(HttpServer.class)
    @Bean
    public HttpServer httpsServer(MyServerProperties myServerProperties) throws IOException {

        // 创建 HttpServer 对象，并启动
        HttpServer server = HttpServer.create(new InetSocketAddress(myServerProperties.getPort()), 0);
        server.start();
        logger.info("[httpServer][启动服务器成功，端口为:{}]", myServerProperties.getPort());


        return null;
    }
}
