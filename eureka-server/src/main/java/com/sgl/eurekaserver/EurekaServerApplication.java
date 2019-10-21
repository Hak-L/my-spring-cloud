package com.sgl.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Ni Klaus
 * @Description //TODO 注册中心
 *  1、 application.yml 配置Eureka信息
 *  2、 注解 @EnableEurekaServer 启动EurekaServer服务
 * @Date 下午 16:16 2019/10/21 0021
 * @Param 
 * @return 
 **/
@EnableEurekaServer //自动加载为Eureka注册中心
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
