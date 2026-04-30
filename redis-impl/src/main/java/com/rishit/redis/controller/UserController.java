package com.rishit.redis.controller;


import com.rishit.redis.dao.UserDao;
import com.rishit.redis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/save")
    public User createUser(@RequestBody User user){
        System.out.println(user);
        user.setUserId(UUID.randomUUID().toString());
        return userDao.save(user);
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable String userId){
        return userDao.get(userId);
    }

    @GetMapping("/getAll")
    public List<User> getAll(){

        Map<Object,Object>  all = userDao.findAll();
        Collection<Object> values = all.values();
        List<User> collect = values.stream().map(value-> (User) value).collect(Collectors.toList());
        return collect;
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String userId){
        userDao.delete(userId);
    }

}
