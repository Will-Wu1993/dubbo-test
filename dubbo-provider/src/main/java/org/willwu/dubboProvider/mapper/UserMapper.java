package org.willwu.dubboProvider.mapper;

import org.willwu.pojo.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author WuShuai
 * @Date 2023/3/16 14:35
 **/
public interface UserMapper {

    public List<User> selectAll();
}
