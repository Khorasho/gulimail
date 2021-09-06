package com.atguigu.gulimall.coupon.service;

import com.atguigu.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author wangxujun
 * @email khorashoer@gmail.com
 * @date 2021-08-29 23:42:41
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

