package com.baomidou.mybatisplus.samples.generator.user.service.impl;

import com.baomidou.mybatisplus.samples.generator.user.entity.User;
import com.baomidou.mybatisplus.samples.generator.user.mapper.UserMapper;
import com.baomidou.mybatisplus.samples.generator.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lcc
 * @since 2019-02-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
