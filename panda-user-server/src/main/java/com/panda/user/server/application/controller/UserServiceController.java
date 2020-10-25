package com.panda.user.server.application.controller;

import com.panda.user.server.application.controller.resp.RegistryDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author jinli
 * @date 2020/10/23
 */
@RestController
@RequestMapping("/user")
public class UserServiceController {
    @ApiOperation(value = "注册")
    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public void registry(@RequestBody RegistryDTO registry) {
        
    }
}
