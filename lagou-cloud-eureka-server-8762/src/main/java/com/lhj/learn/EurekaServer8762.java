package com.lhj.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lihaojie
 * @date 2023/03/06 09:06
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8762 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8762.class, args);
    }
}
