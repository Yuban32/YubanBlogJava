package com.yuban32.controller;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuban32.common.lang.Result;
import com.yuban32.entity.About;
import com.yuban32.service.AboutService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Wrapper;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class AboutController {
    @Autowired
    AboutService aboutService;
    @GetMapping("/about")
    public Result about(){
        List<About> abouts = aboutService.list(new QueryWrapper<About>().orderByDesc("created"));
        return  Result.succ(abouts);
    }
    @RequiresAuthentication
    @PostMapping("/about/edit")
    public Result aboutEdit(@Validated @RequestBody About about){
        About temp = null;

        temp = new About();
        temp.setCreated(LocalDateTime.now());
        BeanUtil.copyProperties(about,temp,"created");
        aboutService.saveOrUpdate(temp);
        return Result.succ(null);
    }
}
