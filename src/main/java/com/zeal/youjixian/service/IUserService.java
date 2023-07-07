package com.zeal.youjixian.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zeal.youjixian.pojo.User;
import com.zeal.youjixian.vo.LoginVo;
import com.zeal.youjixian.vo.RespBean;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * WHAT THE ZZZZEAL
 *
 * @author zeal
 * @since  2023/7/6 9:34
 * @version 1.0
 */
public interface IUserService extends IService<User> {
    /**
     * 登录方法
     *
     * @param loginVo
     * @param request
     * @param response
     * @return com.example.seckilldemo.vo.RespBean
     * @author LC
     * @operation add
     * @date 1:49 下午 2022/3/3
     **/
    RespBean doLongin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);

    /**
     * 根据cookie获取用户
     *
     * @param userTicket
     * @return com.example.seckilldemo.entity.TUser
     * @author LC
     * @operation add
     * @date 1:50 下午 2022/3/3
     **/
    User getUserByCookie(String userTicket, HttpServletRequest request, HttpServletResponse response);


    /**
     * 更新密码
     *
     * @param userTicket
     * @param password
     * @return com.zeal.seckilldemo.vo.RespBean
     * @author LC
     * @operation add
     * @date 9:05 下午 2022/3/4
     **/
    RespBean updatePassword(String userTicket, String password, HttpServletRequest request, HttpServletResponse response);
}
