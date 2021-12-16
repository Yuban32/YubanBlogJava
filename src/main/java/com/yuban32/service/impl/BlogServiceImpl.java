package com.yuban32.service.impl;

import com.yuban32.entity.Blog;
import com.yuban32.mapper.BlogMapper;
import com.yuban32.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
