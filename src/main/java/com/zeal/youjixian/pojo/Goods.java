package com.zeal.youjixian.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * WHAT THE ZZZZEAL
 *
 * @Author zeal
 * @Date 2023/7/6 10:10
 * @Version 1.0
 */
@TableName("t_goods")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods implements Serializable {
    private static final long serialVersionUID = 1L;

    // 商品ID
    private Long id;

    // 商品名称
    private String goodsName;

    // 商品标题
    private String goodsTitle;

    // 商品图片
    private String goodsImg;

    // 商品详情
    private String goodsDetail;

    // 商品价格
    private String goodsPrice;

    // 商品库存
    private Integer goodsStock;
}
