package com.songxh.ironMan.web.controller;

import com.songxh.ironMan.dao.mysql.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户 controller
 *
 * @author hexiaosong
 * @date 2019-04-09
 */
@RequestMapping(value = "/users")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Object getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }
}
