package com.yuban32.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuban32.entity.About;
import com.yuban32.mapper.AboutMapper;
import com.yuban32.service.AboutService;
import org.springframework.stereotype.Service;

@Service
public class AboutServiceImpl extends ServiceImpl<AboutMapper, About> implements AboutService {
}
