package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimallProductApplicationTests {

    @Resource
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("遇到华为店请鞠一躬");
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存好了");
//        List<BrandEntity> list = brandService.list();
//        System.out.println(list);
    }

}
