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
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getSex() {
        return sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public String getMail() {
        return mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public String getPwd() {
        return pwd;
    }
    
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
