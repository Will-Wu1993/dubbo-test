package org.will.dubboConsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.willwu.pojo.User;
import org.willwu.service.UserService;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author WuShuai
 * @Date 2023/3/16 15:02
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userServiceImpl;

    @GetMapping("/selectAll")
    public void selectAll() {
        List<User> users = userServiceImpl.selectAll();
        System.out.println(users.toString());
    }
}
