package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 整合MyBatis-Plus
 * 1、导入依赖
 * 2、配置
 *      1）配置数据源
 *          1.导入数据库驱动
 *          2.在application.yml配置数据源相关信息
 *      2）配置Mybatis-Plus
 *          1.使用@MapperScan
 *          2.告诉Mybatis-Plus映射文件位置
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
