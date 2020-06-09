package com.lagou.springcluster.mapper;

import com.lagou.springcluster.pojo.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * \* @Author: ZhuFangTao
 * \* @Date: 2020/6/8 3:08 下午
 * \
 */
public interface ResumeMapper extends JpaRepository<Resume, Long>,
        JpaSpecificationExecutor<Resume> {
}