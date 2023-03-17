package org.willwu.service;

import org.willwu.pojo.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author WuShuai
 * @Date 2023/3/16 14:26
 **/

public interface UserService {

    public List<User> selectAll();
}
