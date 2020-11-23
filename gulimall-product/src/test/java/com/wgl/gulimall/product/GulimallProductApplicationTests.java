package com.wgl.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wgl.gulimall.product.entity.BrandEntity;
import com.wgl.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("HUAWEI");

       /* brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");
        brandService.updateById(brandEntity);
        System.out.println("成功");*/

        final List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("descript", "华为"));
        for (BrandEntity entity : list) {
            System.out.println(entity);
        }
    }

}
