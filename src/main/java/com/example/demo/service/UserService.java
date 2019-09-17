package com.example.demo.service;

import com.example.demo.common.resp.RespObject;
import com.example.demo.model.po.User;

/**
 * Function description
 *
 * @Author: Vampire-潘伟
 * @Data: 2019/9/10 19:29
 */
public interface UserService {

    int insert(User user);

    RespObject selectBy();

    int updateBy();

    int deleteBy();

}
