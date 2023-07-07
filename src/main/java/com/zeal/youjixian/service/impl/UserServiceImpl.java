package com.zeal.youjixian.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zeal.youjixian.exception.GlobalException;
import com.zeal.youjixian.mapper.UserMapper;
import com.zeal.youjixian.pojo.User;
import com.zeal.youjixian.service.IUserService;
import com.zeal.youjixian.utils.CookieUtil;
import com.zeal.youjixian.utils.MD5Util;
import com.zeal.youjixian.utils.UUIDUtil;
import com.zeal.youjixian.vo.LoginVo;
import com.zeal.youjixian.vo.RespBean;
import com.zeal.youjixian.vo.RespBeanEnum;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * WHAT THE ZZZZEAL
 *
 * @author zeal
 * @since 2023/7/6 9:14
 * @version 1.0
 */
@Service
@Primary
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public RespBean doLongin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response) {
        String mobile = loginVo.getMobile();
        String password = loginVo.getPassword();
        User user = userMapper.selectById(mobile);
        if (ObjectUtils.isEmpty(user)) {
            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
        }
        if (!MD5Util.fromPassToDBPass(password, user.getSalt()).equals(user.getPassword())) {
            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
        }
        String ticket = UUIDUtil.uuid();
        redisTemplate.opsForValue().set("user: " + ticket, user);
        CookieUtil.setCookie(request, response, "userTicket", ticket);
        return null;
    }

    @Override
    public User getUserByCookie(String userTicket, HttpServletRequest request, HttpServletResponse response) {
        if (!StringUtils.hasLength(userTicket)) {
            return null;
        }
        User user = (User)redisTemplate.opsForValue().get("user:" + userTicket);
        if (ObjectUtils.isEmpty(user)) {
            CookieUtil.setCookie(request, response, "userTicket", userTicket);
        }
        return user;
    }

    @Override
    public RespBean updatePassword(String userTicket, String password, HttpServletRequest request, HttpServletResponse response) {
        return null;
    }
}
