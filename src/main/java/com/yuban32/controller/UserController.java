package com.yuban32.controller;


import com.yuban32.entity.User;
import com.yuban32.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Yuban32
 * @since 2021-12-10
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/{id}")
    public Object test(@PathVariable("id") Long id){
        return userService.getById(id);
    }
    @PostMapping("/save")
    public Object testUser(@Validated @RequestBody User user){
        return user.toString();
    }
}
