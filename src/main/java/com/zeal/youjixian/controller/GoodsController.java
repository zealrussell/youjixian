package com.zeal.youjixian.controller;

import com.zeal.youjixian.pojo.User;
import com.zeal.youjixian.service.IUserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * WHAT THE ZZZZEAL
 *
 * @author zeal
 * @version 1.0
 * @since 2023/7/6 15:32
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/toList")
    public String toList(HttpServletRequest request, HttpServletResponse response, Model model, @CookieValue("userTicket") String ticket) {
        if (!StringUtils.hasLength(ticket)) {
            return "login";
        }
        User user = userService.getUserByCookie(ticket, request, response);
        if (ObjectUtils.isEmpty(user)) {
            return "login";
        }
        model.addAttribute("user", user);
        return "goodsList";
    }
}
