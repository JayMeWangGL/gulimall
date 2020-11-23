package com.wgl.gulimall.coupon.dao;

import com.wgl.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wangguoli
 * @email wangguoli@gmail.com
 * @date 2020-11-23 14:13:17
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
