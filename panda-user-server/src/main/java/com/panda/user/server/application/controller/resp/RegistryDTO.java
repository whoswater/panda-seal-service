package com.panda.user.server.application.controller.resp;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author jinli
 * @date 2020/10/23
 */
public class RegistryDTO {
    @ApiModelProperty(value = "注册名")
    private String name;
    @ApiModelProperty(value = "手机号")
    private String phone;
    @ApiModelProperty(value = "性别")
    private String sex;
    @ApiModelProperty(value = "邮箱")
    private String mail;
    @ApiModelProperty(value = "密码")
    private  String pwd;
}
