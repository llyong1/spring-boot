package com.example.boot.domain.cm.service.impl;

import com.example.boot.domain.cm.entity.User;
import com.example.boot.domain.cm.mapper.UserMapper;
import com.example.boot.domain.cm.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author lvyongb
 * @since 2018-09-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
