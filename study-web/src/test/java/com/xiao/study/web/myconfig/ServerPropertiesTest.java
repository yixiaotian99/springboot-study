package com.xiao.study.web.myconfig;

import cn.hutool.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 21:22
 * @Description TODO
 **/
@SpringBootTest
class ServerPropertiesTest {


    @Autowired
    private ServerProperties serverProperties;

    @Test
    public void testServerProperties() {
        System.out.println("输出:");
        System.out.println(JSONUtil.toJsonStr(serverProperties));
    }

}