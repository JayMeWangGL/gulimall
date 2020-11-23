package com.wgl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wgl.common.utils.PageUtils;
import com.wgl.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author wangguoli
 * @email wangguoli@gmail.com
 * @date 2020-11-21 14:14:54
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

