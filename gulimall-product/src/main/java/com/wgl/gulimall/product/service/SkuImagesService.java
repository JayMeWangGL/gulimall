package com.wgl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wgl.common.utils.PageUtils;
import com.wgl.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wangguoli
 * @email wangguoli@gmail.com
 * @date 2020-11-21 14:14:55
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

