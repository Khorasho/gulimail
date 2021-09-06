package com.atguigu.gulimall.coupon.service;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author wangxujun
 * @email khorashoer@gmail.com
 * @date 2021-08-29 23:42:42
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

