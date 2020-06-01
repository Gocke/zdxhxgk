package com.kk.zdxhxgk.security.service.impl;

import com.kk.zdxhxgk.security.entity.User;
import com.kk.zdxhxgk.security.mapper.UserMapper;
import com.kk.zdxhxgk.security.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Gocke
 * @since 2020-06-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
