package com.lhj.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author lihaojie
 * @date 2023/03/05 20:37
 **/
@SpringBootApplication
public class AutodeliverApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutodeliverApplication.class, args);
    }

    //使用RestTemplate 模板对象进行远程调用
    //注入:RestTemplate
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
