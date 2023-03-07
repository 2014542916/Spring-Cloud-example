package com.lhj.learn.service;

import com.lhj.learn.pojo.Resume;

public interface ResumeService {
    /**
     * 根据用户名查找默认简介
     *
     * @param userId  用户id
     * @return com.lhj.learn.pojo.Resume
     * @author lihaojie
     * @date 2023/03/05 19:31
     */
    Resume findDefaultResumeByUserId(Long userId);

}
