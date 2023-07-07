package com.zeal.youjixian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zeal.youjixian.pojo.Goods;
import com.zeal.youjixian.vo.GoodsVo;

import java.util.List;

/**
 * WHAT THE ZZZZEAL
 *
 * @author zeal
 * @version 1.0
 * @since 2023/7/6 15:29
 */
public interface GoodsMapper extends BaseMapper<Goods> {

    List<GoodsVo> findGoodsVo();
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
