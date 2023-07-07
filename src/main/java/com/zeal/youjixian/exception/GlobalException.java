package com.zeal.youjixian.exception;

import com.zeal.youjixian.vo.RespBeanEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * WHAT THE ZZZZEAL
 *
 * @Author zeal
 * @Date 2023/7/6 11:38
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalException extends RuntimeException {
    private RespBeanEnum respBeanEnum;

}
