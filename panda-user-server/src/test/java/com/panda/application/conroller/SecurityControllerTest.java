package com.panda.application.conroller;

import com.panda.BaseJunitTest;
import com.panda.user.server.application.controller.SecurityController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jinli
 * @date 2020/10/23
 */
public class SecurityControllerTest extends BaseJunitTest {
    @Autowired
    private SecurityController securityController;
    
    @Test
    public void testImageVerificationCode(){
    }
}
