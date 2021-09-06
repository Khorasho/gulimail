package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangxujun
 * @email khorashoer@gmail.com
 * @date 2021-08-29 23:58:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
