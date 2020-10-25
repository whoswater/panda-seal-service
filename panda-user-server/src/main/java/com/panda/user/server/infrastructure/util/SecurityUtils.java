package com.panda.user.server.infrastructure.util;

import com.panda.user.server.infrastructure.util.entity.ImageVerificationCode;
import sun.misc.BASE64Encoder;

import java.security.MessageDigest;


/**
 * @author jinli
 * @date 2020/10/25
 */
public class SecurityUtils {
    
    private SecurityUtils() {
    }
    
    private static final  String MD5 = "MD5";
    
    public  static ImageVerificationCode getImageVerificationCode(int weight,int height){
        ImageVerificationCode ivc = new ImageVerificationCode(weight,height);
        return  ivc;
    }
    
    
    public  static String encryptByMD5(String plainText ){
    
        try {
            MessageDigest md = MessageDigest.getInstance(MD5);
            byte[] b1 = md.digest(plainText.getBytes());
            BASE64Encoder encoder = new BASE64Encoder();
            return encoder.encode(b1);
        } catch(Exception e) {
            return null;
        }
    }
 }
