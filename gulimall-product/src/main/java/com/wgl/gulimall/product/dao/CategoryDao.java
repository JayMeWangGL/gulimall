package com.wgl.gulimall.product.dao;

import com.wgl.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangguoli
 * @email wangguoli@gmail.com
 * @date 2020-11-21 14:14:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
