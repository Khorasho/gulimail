package com.atguigu.gulimall.ware;

import com.atguigu.gulimall.ware.entity.WareInfoEntity;
import com.atguigu.gulimall.ware.service.WareInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimallWareApplicationTests {
    @Resource
    private WareInfoService wareInfoService;

    @Test
    void contextLoads() {
        WareInfoEntity wareInfoEntity = new WareInfoEntity();
        wareInfoEntity.setAddress("华为店");
        wareInfoService.save(wareInfoEntity);
        System.out.println("保存好了");
    }

}
