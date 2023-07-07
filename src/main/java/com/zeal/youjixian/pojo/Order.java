package com.zeal.youjixian.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * WHAT THE ZZZZEAL
 *
 * @Author zeal
 * @Date 2023/7/6 10:10
 * @Version 1.0
 */
@TableName("t_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
    private static final long serialVersionID = 1L;

    // 订单ID
    private Long id;

    // 用户id
    private Long userId;

    // 商品ID
    private Long goodsId;

    // 收货地址ID
    private Long deliveryAddrId;

    // 商品名称
    private String goodsName;

    // 商品数量
    private Integer goodsCount;

    // 商品价格
    private BigDecimal goodsPrice;

    // 购买渠道 1 pc,2 android, 3 ios
    private Integer orderChannel;

    // 订单状态 0新建未支付，1已支付，2已发货，3已收货，4已退货，5已完成
    private Integer status;

    // 订单创建时间
    private Date createDate;

    // 订单支付时间
    private Date payDate;
}
