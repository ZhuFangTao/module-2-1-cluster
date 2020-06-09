package com.lagou.springcluster.service.impl;

import com.lagou.springcluster.mapper.ResumeMapper;
import com.lagou.springcluster.pojo.Resume;
import com.lagou.springcluster.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * \* User: ZhuFangTao
 * \* Date: 2020/6/8 3:07 下午
 * \
 */
@Service("resumeService")
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeMapper resumeMapper;

    @Override
    public Resume queryById(long id) {
        Optional<Resume> resume = resumeMapper.findById(id);
        return resume.isPresent() ? resume.get() : null;
    }

    @Override
    public List<Resume> queryAll() {
        return resumeMapper.findAll();
    }

    @Override
    public Resume save(Resume resume) {
        return resumeMapper.save(resume);
    }

    @Override
    public void delete(long id) {
        resumeMapper.deleteById(id);
    }

}