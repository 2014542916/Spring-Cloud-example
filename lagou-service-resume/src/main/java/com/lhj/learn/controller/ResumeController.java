package com.lhj.learn.controller;

import com.lhj.learn.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简li接口
 *
 * @author lihaojie
 * @date 2023/03/05 19:36
 **/
@RestController
@RequestMapping("/resume")
public class ResumeController {
    @Autowired
    private ResumeService resumeService;
    @GetMapping("/openstate/{userId}")
    public Integer findDefaultResumeState(@PathVariable Long userId) {
        return resumeService.findDefaultResumeByUserId(userId).getIsOpenResume();
    }
}
