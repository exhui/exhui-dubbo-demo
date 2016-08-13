package com.exhui.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 服务提供者的启动程序
 *
 * @author exhui
 * @version 1.0
 * @since 1.0
 */
public class DemoProviderBootstrap {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");
        context.start();
        System.out.println("Demo服务已经启动...");
        System.in.read();
    }
}
