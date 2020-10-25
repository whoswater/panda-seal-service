package com.panda.user.server.domain.security.service;

import com.panda.user.server.infrastructure.util.entity.ImageVerificationCode;

/**
 * @author jinli
 * @date 2020/10/25
 */
public interface SecurityService {
    
    /**
     * 获取图片验证码
     * @param weight 宽度
     * @param height 高度
     * @return 验证码实体
     */
    ImageVerificationCode getImageVerificationCode(int weight,int height);
    
    /**
     *  加密
     * @param plainText 原文
     * @return 密文
     */
    String encrypt(String plainText);
}
