package com.kob.backend.controller.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kob.backend.mapper.UserMapper;
import com.kob.backend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * ClassName: UserController
 * Package: com.kob.backend.controller.user
 * Description:
 *
 * @Author Cleve14nd
 * @Create 2023/6/6 23:37
 * @Version 1.0
 */

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/all")
    public List<User> getAll(){
        return userMapper.selectList(null);
    }

    @GetMapping("/user/{userId}/")
    public User getUser(@PathVariable int userId){
        //return userMapper.selectById(userId);

        //根据条件查询某一个
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",userId);

        //ge lt 大于等于 小于
        return userMapper.selectOne(queryWrapper);
    }
    @GetMapping("/user/add/{userId}/{username}/{password}")
    public  String addUser(@PathVariable int userId,
                           @PathVariable String username,
                           @PathVariable String password ){
        PasswordEncoder passwordEncoder =new BCryptPasswordEncoder() ;
        String encodedPassword=passwordEncoder.encode(password);
        User user=new User(userId,username,encodedPassword);
        userMapper.insert(user);
        return "Add User Successfully";

    }
    @GetMapping("/user/delete/{userId}/")
    public  String addUser(@PathVariable int userId){

        userMapper.deleteById(userId);
        return "Delete User Successfully";

    }
}
