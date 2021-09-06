package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author wangxujun
 * @email khorashoer@gmail.com
 * @date 2021-08-29 22:12:36
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
