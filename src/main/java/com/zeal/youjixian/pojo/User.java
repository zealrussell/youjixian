package com.zeal.youjixian.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * WHAT THE ZZZZEAL
 *
 * @Author zeal
 * @Date 2023/7/6 9:35
 * @Version 1.0
 */
@TableName("t_user")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    // 用户ID
    @TableId
    private Long id;

    // 昵称
    private String nickname;

    // 密码
    private String password;

    // 盐
    private String salt;

    // 头像
    private String head;

    // 注册时间
    private Date registerDate;

    // 最后登录时间
    private Date lastLoginDate;

    // 登录次数
    private Integer loginCount;
}
