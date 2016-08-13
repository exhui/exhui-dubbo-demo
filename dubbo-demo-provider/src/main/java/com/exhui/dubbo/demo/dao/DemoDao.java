package com.exhui.dubbo.demo.dao;

import com.exhui.dubbo.demo.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DemoDao extends JpaRepository<Demo, Integer> {

    List<Demo> findByName(String name);
}
