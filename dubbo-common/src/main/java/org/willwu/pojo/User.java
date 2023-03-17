package org.willwu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author WuShuai
 * @Date 2023/3/16 14:18
 **/
@Data
public class User implements Serializable {

    /**
     * 主键 唯一标识
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
