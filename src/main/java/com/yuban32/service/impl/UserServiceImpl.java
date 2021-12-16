package com.yuban32.service.impl;

import com.yuban32.entity.User;
import com.yuban32.mapper.UserMapper;
import com.yuban32.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Yuban32
 * @since 2021-12-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
