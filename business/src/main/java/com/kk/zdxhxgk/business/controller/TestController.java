package com.kk.zdxhxgk.business.controller;

import com.kk.zdxhxgk.business.mapper.TestJpa;
import com.kk.zdxhxgk.business.model.Test;
import com.kk.zdxhxgk.business.server.TestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Gocke
 * 2020/5/12
 */
@Controller
public class TestController {
    @Autowired
    private TestServer testServer;
    @Autowired
    private TestJpa testJpa;
    @GetMapping("/test")
    @ResponseBody
    public List<Test> test(){
        List<Test>  jpaList = testJpa.findByNameLike("%托%");
        return testServer.selectAll();
    }
}
