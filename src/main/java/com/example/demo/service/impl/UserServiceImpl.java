package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.resp.RespObject;
import com.example.demo.dao.UserMapper;
import com.example.demo.model.po.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Function description
 *
 * @Author: Vampire-潘伟
 * @Data: 2019/9/10 19:30
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public RespObject selectBy() {
        RespObject respObject = new RespObject();
//        User user = userMapper.selectById(1);
        User user = userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getId, 1));
        respObject.setData(user);

//        List<Long> idList = new ArrayList<>();
//        idList.add(1L);
//        idList.add(2L);
//        List<User> userList = userMapper.selectBatchIds(idList);
//        respObject.setData(userList);

//        List<User> userList = userMapper.selectList(new QueryWrapper<User>().select().orderByDesc("update_time"));
//        List<User> userList = userMapper.selectList(Wrappers.<User>lambdaQuery().select());
//        List<User> userList = userMapper.selectList(new LambdaQueryWrapper<User>().select());
//        respObject.setData(userList);

//        IPage<User> page = userMapper.selectPage(new Page<>(0, 2), new QueryWrapper<>());
//        IPage<Map<String, Object>> page = userMapper.selectMapsPage(new Page<>(0, 2), new QueryWrapper<>());
//        respObject.setData(page);
        return respObject;
    }

    @Override
    public int updateBy() {
        User user = userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getId, 1));
        if (user != null) {
            user.setAge(10);
            int id = userMapper.updateById(user);
            return id;
        }
        return 0;
    }

    @Override
    public int deleteBy() {
        int id = userMapper.deleteById(1);
        return id;
    }
}
