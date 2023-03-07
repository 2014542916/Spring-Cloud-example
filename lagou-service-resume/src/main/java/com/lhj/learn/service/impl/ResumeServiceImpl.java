package com.lhj.learn.service.impl;

import com.lhj.learn.dao.ResumeDao;
import com.lhj.learn.pojo.Resume;
import com.lhj.learn.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 * @author lihaojie
 * @date 2023/03/05 19:29
 **/
@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeDao resumeDao;

    /**
     * 根据用户名查找默认简介
     *
     * @param userId 用户id
     * @return com.lhj.learn.pojo.Resume
     * @author lihaojie
     * @date 2023/03/05 19:31
     */
    @Override
    public Resume findDefaultResumeByUserId(Long userId) {
        Resume resume = new Resume();
        resume.setUserId(userId);
        //查询默认简历
        resume.setIsDefault(1);
        //根据resume实例来创建模板进行查找
        Example<Resume> example=Example.of(resume);
        return resumeDao.findOne(example).get();
    }
}
