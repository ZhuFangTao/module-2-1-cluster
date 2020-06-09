package com.lagou.springcluster.service;

import com.lagou.springcluster.pojo.Resume;

import java.util.List;

/**
 * \* @Author: ZhuFangTao
 * \* @Date: 2020/6/8 3:06 下午
 * \
 */
public interface ResumeService {
    Resume queryById(long id);

    List<Resume> queryAll();

    Resume save(Resume resume);

    void delete(long id);
}