package com.lhj.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lihaojie
 * @date 2023/03/05 19:41
 **/
@SpringBootApplication
@EntityScan("com.lhj.learn.pojo")
@EnableDiscoveryClient //这是通用类型的注解 不加注解也可以用 但是建议
public class ResumeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResumeApplication.class, args);
    }
}
