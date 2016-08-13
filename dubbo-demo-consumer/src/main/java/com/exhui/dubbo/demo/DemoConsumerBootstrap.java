package com.exhui.dubbo.demo;

import com.exhui.dubbo.demo.api.DemoService;
import com.exhui.dubbo.demo.vo.DemoVo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StopWatch;

public class DemoConsumerBootstrap {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");
        context.start();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("getBean");
        DemoService demoService = context.getBean(DemoService.class);
        stopWatch.stop();
//        for(int i = 0;i<5;i++) {
//            stopWatch.start("findOneById(" + i + ")");
//            DemoVo demoVo = demoService.findOneById(i);
//            if(demoVo != null) {
//                System.out.println(demoVo.getName());
//            }
//            stopWatch.stop();
//        }
        System.out.println(demoService.sayHello("exhui"));
        System.out.println(stopWatch.prettyPrint());
    }
}