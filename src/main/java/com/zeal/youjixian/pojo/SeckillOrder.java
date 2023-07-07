package com.zeal.youjixian.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * WHAT THE ZZZZEAL
 *
 * @Author zeal
 * @Date 2023/7/6 11:18
 * @Version 1.0
 */
@TableName("t_seckill_order")
@Data
public class SeckillOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 秒杀订单ID **/
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /** 用户ID **/
    private Long userId;

    /** 订单ID **/
    private Long orderId;

    /** 商品ID **/
    private Long goodsId;
}
