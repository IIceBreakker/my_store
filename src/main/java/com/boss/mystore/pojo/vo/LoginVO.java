package com.boss.mystore.pojo.vo;

import lombok.Data;

/**
 * VO类，用于请求，前端登录页面数据包装类
 *
 * @author fanghan
 */
@Data
public class LoginVO {

    private String username;
    private String password;

}
