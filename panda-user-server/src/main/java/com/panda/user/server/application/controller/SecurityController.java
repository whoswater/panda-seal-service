package com.panda.user.server.application.controller;

import com.panda.user.server.domain.security.service.ImageVerificationCode;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

/**
 * @author jinli
 * @date 2020/10/23
 */
@RestController
@RequestMapping("/security")
public class SecurityController {
    
    
    @RequestMapping(value = "/image/verification_code", method = RequestMethod.GET)
    public void checkCode(HttpServletRequest request, HttpServletResponse response,int height,int weight) {
    
        ImageVerificationCode ivc = new ImageVerificationCode(weight,height);
        BufferedImage image = ivc.getImage();
        request.getSession().setAttribute("text", ivc.getText());
        try{
            ivc.output(image, response.getOutputStream());
        }catch (Exception e){
        
        }
        
    }
}
