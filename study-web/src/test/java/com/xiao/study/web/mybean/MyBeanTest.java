package com.xiao.study.web.mybean;

import com.xiao.study.web.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author sunjinwei
 * @Date 2020-07-28 22:20
 * @Description TODO
 **/
@SpringBootTest
class MyBeanTest {


    @Test
    public void testThirdBean() {


        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Object myBean = ctx.getBean("myBean");

        System.out.println("输出");
        System.out.println(myBean);

        //使用 Bean 注解方法注入对象
        Object p1 = ctx.getBean("personService");
        System.out.println(p1);

//        //直接获取java对象报错
//        Object p2 = ctx.getBean("personService2");
//        System.out.println(p2);
    }


    @Test
    public void testThirdBean2() {


        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Object myBean = ctx.getBean("myBean2");

        System.out.println("输出");
        System.out.println(myBean);

        //使用 Bean 注解方法注入对象
        Object p1 = ctx.getBean("personService3");
        System.out.println(p1);

//        //直接获取java对象报错
//        Object p2 = ctx.getBean("getService2");
//        System.out.println(p2);
    }

}