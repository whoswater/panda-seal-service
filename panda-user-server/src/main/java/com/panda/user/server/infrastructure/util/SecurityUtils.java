package com.panda.user.server.infrastructure.util;

import com.panda.user.server.infrastructure.util.entity.ImageVerificationCode;
import org.springframework.util.DigestUtils;


/**
 * @author jinli
 * @date 2020/10/25
 */
public class SecurityUtils {
    
    private SecurityUtils() {
    }
    
    private static final String MD5 = "MD5";
    
    public static ImageVerificationCode getImageVerificationCode(int weight, int height) {
        ImageVerificationCode ivc = new ImageVerificationCode(weight, height);
        return ivc;
    }
    
    public static String encryptByMD5(String plainText) {
        return DigestUtils.md5DigestAsHex(plainText.getBytes());
    }
}
