package com.lhj.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lihaojie
 * @date 2023/03/05 20:33
 **/
@RestController
@RequestMapping("/autodelicer")
public class AutoDeliverController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/checkState/{userId}")
    public Integer findResumeByUserId(@PathVariable Long userId) {
        //调用远程服务:resume-server(简历微服务)  RestTemple
        /**
         * 调用远程服务
         *
         * @param url 需要调用的远程服务地址
         * @param  responseType 返回的类型
         *
         */
        Integer forObject = restTemplate.getForObject("http://localhost:8080/resume/openstate/" + userId, Integer.class);
        return forObject;

    }
}
