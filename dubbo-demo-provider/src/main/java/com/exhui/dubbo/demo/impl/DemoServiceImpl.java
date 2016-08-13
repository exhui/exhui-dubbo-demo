package com.exhui.dubbo.demo.impl;

import com.exhui.dubbo.demo.api.DemoService;
import com.exhui.dubbo.demo.dao.DemoDao;
import com.exhui.dubbo.demo.entity.Demo;
import com.exhui.dubbo.demo.vo.DemoVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author chenyonghui
 * @version 1.0
 * @since 1.0
 */
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public DemoVo findOneById(int id) {
        Demo demo = demoDao.findOne(id);
        DemoVo demoVo = null;
        if(demo != null) {
            demoVo = new DemoVo();
            BeanUtils.copyProperties(demo, demoVo);
        }
        return demoVo;
    }
}
