package com.exhui.dubbo.demo.api;

import com.exhui.dubbo.demo.vo.DemoVo;

/**
 * @author exhui
 * @version 1.0
 * @since 1.0
 */
public interface DemoService {

    String sayHello(String name);

    DemoVo findOneById(int id);
}
