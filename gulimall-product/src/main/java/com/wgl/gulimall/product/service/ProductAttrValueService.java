package com.wgl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wgl.common.utils.PageUtils;
import com.wgl.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author wangguoli
 * @email wangguoli@gmail.com
 * @date 2020-11-21 14:14:55
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

