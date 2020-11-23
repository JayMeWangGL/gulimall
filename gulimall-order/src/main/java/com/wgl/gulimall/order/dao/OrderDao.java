package com.wgl.gulimall.order.dao;

import com.wgl.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangguoli
 * @email wangguoli@gmail.com
 * @date 2020-11-23 14:27:48
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
