package com.wgl.gulimall.ware.dao;

import com.wgl.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author wangguoli
 * @email wangguoli@gmail.com
 * @date 2020-11-23 14:34:06
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
