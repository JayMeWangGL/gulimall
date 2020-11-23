package com.wgl.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wgl.common.utils.PageUtils;
import com.wgl.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wangguoli
 * @email wangguoli@gmail.com
 * @date 2020-11-23 14:27:48
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

