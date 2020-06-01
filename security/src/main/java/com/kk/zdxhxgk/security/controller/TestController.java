package com.kk.zdxhxgk.security.controller;


import com.kk.zdxhxgk.security.entity.Test;
import com.kk.zdxhxgk.security.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Gocke
 * @since 2020-06-01
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService testService;
    @GetMapping("data")
   public Object getTestData(){
        Test test = testService.getById(1);
        return test;
   }
}
