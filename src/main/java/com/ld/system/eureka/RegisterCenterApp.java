package com.ld.system.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 *
 * @author 王海龙
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(RegisterCenterApp.class, args);
    }
}
