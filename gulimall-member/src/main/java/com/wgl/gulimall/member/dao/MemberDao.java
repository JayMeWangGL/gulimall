package com.wgl.gulimall.member.dao;

import com.wgl.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangguoli
 * @email wangguoli@gmail.com
 * @date 2020-11-23 14:20:18
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
