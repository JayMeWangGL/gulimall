package com.wgl.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wgl.common.utils.PageUtils;
import com.wgl.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author wangguoli
 * @email wangguoli@gmail.com
 * @date 2020-11-23 14:20:18
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

