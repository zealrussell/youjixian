package com.zeal.youjixian.utils;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * WHAT THE ZZZZEAL
 *
 * @Author zeal
 * @Date 2023/7/5 18:14
 * @Version 1.0
 */
public class ValidatorUtil {
    // 手机号正则校验
    private static final Pattern mobile_patten = Pattern.compile("[1]([3-9])[0-9]{9}$");

    public static boolean isMobile(String mobile) {
        if (!StringUtils.hasLength(mobile)) {
            return false;
        }
        Matcher matcher = mobile_patten.matcher(mobile);
        return matcher.matches();
    }
}
