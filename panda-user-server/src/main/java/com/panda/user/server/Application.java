package com.panda.user.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jinli
 * @date 2020/10/21
 */

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setRegisterShutdownHook(false);
        springApplication.run(args);
    }
}
