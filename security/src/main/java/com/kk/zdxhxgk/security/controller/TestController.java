package com.kk.zdxhxgk.security.controller;


import cn.hutool.core.map.MapUtil;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kk.zdxhxgk.security.common.Result;
import com.kk.zdxhxgk.security.dto.LoginDto;
import com.kk.zdxhxgk.security.entity.Test;
import com.kk.zdxhxgk.security.entity.User;
import com.kk.zdxhxgk.security.service.TestService;
import com.kk.zdxhxgk.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

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
    @Autowired
    UserService userService;
    @GetMapping("data")
   public Object getTestData(){
        LoginDto loginDto = new LoginDto();
        loginDto.setUsername("markerhub");
        Test test = testService.getById(1);
        User user = userService.getOne(new QueryWrapper<User>().eq("username", loginDto.getUsername()));
         int t = 3/0;
        return user;
   }

}
