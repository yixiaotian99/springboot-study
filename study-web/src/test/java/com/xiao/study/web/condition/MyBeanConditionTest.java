package com.xiao.study.web.condition;

import com.xiao.study.web.config.AppConfig;
import com.xiao.study.web.myconfig.ServerProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.TestPropertySource;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 23:04
 * @Description TODO
 **/
@SpringBootTest
@TestPropertySource("classpath:application.yml")
class MyBeanConditionTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private ServerProperties serverProperties;

    @Value("${test.num}")
    private String name;

    @Test
    public void testConditionOnBean() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

//        A bean1 = ctx.getBean(A.class);
//        System.out.println(bean1);


        Object userService = ctx.getBean("userService");
        System.out.println(userService);
    }


    @Test
    public void testConditionOnMissingBean() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Object userService = ctx.getBean("userService2");
        System.out.println(userService);
    }


    @Test
    public void testConditionOnClass() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Object userService = ctx.getBean("userService3");
        System.out.println(userService);
    }


    @Test
    public void testConditionOnProperty() {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(serverProperties);
        System.out.println(name);

        /**
         * 使用注入的 applicationContext 获取bean，否则获取不到注入的 yml 值
         */
        Object userService = applicationContext.getBean("userService4");
        System.out.println(userService);
    }


    @Test
    public void testConditionOnResource() {

        Object userService = applicationContext.getBean("userService5");
        System.out.println(userService);
    }

    @Test
    public void testConditionOnSpel() {

        Object userService = applicationContext.getBean("userService6");
        System.out.println(userService);
    }


    @Test
    public void testConditionOnJavaVersion() {

        Object userService = applicationContext.getBean("userService7");
        System.out.println(userService);
    }


    @Test
    public void testConditionOnWeb() {

        Object userService = applicationContext.getBean("userService8");
        System.out.println(userService);
    }
}