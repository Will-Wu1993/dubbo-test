package org.willwu.dubboProvider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.willwu.pojo.User;
import org.willwu.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author WuShuai
 * @Date 2023/3/16 14:39
 **/
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public List<User> selectAll() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setUsername("用户" + i);
            user.setPassword("密码" + i);
            users.add(user);
        }
        return users;
    }
}
