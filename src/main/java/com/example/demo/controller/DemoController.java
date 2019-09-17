package com.example.demo.controller;

import com.example.demo.common.resp.RespObject;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function description
 *
 * @Author: Vampire-潘伟
 * @Data: 2019/9/10 18:14
 */
@RestController
@RequestMapping("/")
public class DemoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    UserService userService;

    @RequestMapping("demo")
    private String demo() {
        LOGGER.debug("hello springboot...");
        return "hello springboot...";
    }

    @RequestMapping("crud")
    private RespObject crud() {
        RespObject respObject = new RespObject();
//        1. insert:
//        for (int i = 0; i < 20; i++) {
//            User user = new User();
//            user.setName("aaa" + i);
//            user.setAge(20 + i);
//            userService.insert(user);
//        }
//        2. select
//        respObject = userService.selectBy();
//        LOGGER.debug(respObject.toString());
//        3. update
//        int id = userService.updateBy();
//        respObject.setData(id);
//        4. delete
//        int id = userService.deleteBy();
//        respObject.setData(id);
        return respObject;
    }

}
