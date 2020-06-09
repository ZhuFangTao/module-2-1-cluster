package com.lagou.springcluster.controller;

import com.lagou.springcluster.pojo.Resume;
import com.lagou.springcluster.service.ResumeService;
import com.lagou.springcluster.util.RunTimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * \* @Author: ZhuFangTao
 * \* @Date: 2020/5/19 9:33 上午
 * \
 */
@Controller
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;


    @RequestMapping
    public String resume(HttpServletRequest request, ModelMap modelMap) {
        modelMap.addAttribute("server", RunTimeUtil.getTomcatPort());
        modelMap.addAttribute("sessionId", request.getSession().getId());
        return "resume/index";
    }

    @RequestMapping(value = "/queryById")
    @ResponseBody
    public Resume queryById(@RequestParam("id") long id) {
        return resumeService.queryById(id);
    }

    @RequestMapping(value = "/queryAll")
    @ResponseBody
    public List<Resume> queryAll() {
        return resumeService.queryAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Resume save(@RequestBody Resume resume) {
        return resumeService.save(resume);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(@RequestParam("id") long id, HttpServletResponse response) throws IOException {
        resumeService.delete(id);
        response.getWriter().write("delete success");
    }

}