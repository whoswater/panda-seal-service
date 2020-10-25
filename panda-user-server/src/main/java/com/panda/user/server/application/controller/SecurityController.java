package com.panda.user.server.application.controller;

import com.panda.user.server.domain.security.service.SecurityService;
import com.panda.user.server.infrastructure.util.entity.ImageVerificationCode;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    
    @Autowired
    private SecurityService securityService;
    
    @ApiOperation(value = "图片验证码 验证码文字存放于session")
    @RequestMapping(value = "/image/verification_code", method = RequestMethod.GET)
    public void checkCode(HttpServletRequest request, HttpServletResponse response,
                          @ApiParam(value = "验证码图片宽度", example = "10") @RequestParam(value = "type", required = false,
                                  defaultValue =
                                          "10") int weight,
                          @ApiParam(value = "验证码图片高度", example = "40") @RequestParam(value = "type", required = false,
                                  defaultValue =
                                          "40") int height) {
        
        ImageVerificationCode ivc = securityService.getImageVerificationCode(weight, height);
        BufferedImage image = ivc.getImage();
        request.getSession().setAttribute("text", ivc.getText());
        try {
            ivc.output(image, response.getOutputStream());
        } catch (Exception e) {
        
        }
    }
}
