package com.xiao.study.web.condition;

import com.xiao.study.web.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 23:04
 * @Description TODO
 **/
@SpringBootTest
class MyBeanConditionTest {


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

}