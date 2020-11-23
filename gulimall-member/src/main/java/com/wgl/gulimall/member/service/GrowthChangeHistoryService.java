package com.wgl.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wgl.common.utils.PageUtils;
import com.wgl.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author wangguoli
 * @email wangguoli@gmail.com
 * @date 2020-11-23 14:20:18
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

