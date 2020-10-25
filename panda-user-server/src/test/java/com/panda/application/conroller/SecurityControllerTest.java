package com.panda.application.conroller;

import com.panda.BaseJunitTest;
import com.panda.user.server.application.controller.SecurityController;
import com.panda.user.server.domain.security.service.ImageVerificationCode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

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
