package com.rishit.redis.dao;


import com.rishit.redis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserDao {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private static final String Key="USER123123";

    public User save(User user){
        redisTemplate.opsForHash().put(Key,user.getUserId(),user);
        return user;
    }

    public User get(String userId){
        return (User) redisTemplate.opsForHash().get(Key,userId);
    }

    //find all
    public Map<Object, Object> findAll(){
        return redisTemplate.opsForHash().entries(Key);
    }

    //delete
    public void delete(String userId){
        redisTemplate.opsForHash().delete(Key,userId);
    }
}
