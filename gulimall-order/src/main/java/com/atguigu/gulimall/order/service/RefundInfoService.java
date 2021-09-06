package com.atguigu.gulimall.order.service;

import com.atguigu.gulimall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 退款信息
 *
 * @author wangxujun
 * @email khorashoer@gmail.com
 * @date 2021-08-30 00:11:46
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

