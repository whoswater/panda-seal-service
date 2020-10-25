package com.panda.user.server.domain.security.service.impl;

import com.panda.user.server.domain.security.service.SecurityService;
import com.panda.user.server.infrastructure.util.SecurityUtils;
import com.panda.user.server.infrastructure.util.entity.ImageVerificationCode;
import org.springframework.stereotype.Service;

/**
 * @author jinli
 * @date 2020/10/25
 */
@Service
public class SecurityServiceImpl implements SecurityService {
    
    @Override
    public ImageVerificationCode getImageVerificationCode( int weight,int height){
        return  SecurityUtils.getImageVerificationCode(weight,height);
    }
    
    @Override
    public String encrypt(String plainText){
        return SecurityUtils.encryptByMD5(plainText);
    }
}
