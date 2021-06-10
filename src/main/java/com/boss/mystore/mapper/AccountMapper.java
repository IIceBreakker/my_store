package com.boss.mystore.mapper;

import com.boss.mystore.pojo.po.Account;
import com.boss.mystore.pojo.vo.LoginVO;
import org.apache.ibatis.annotations.Param;

/**
 * Account模块数据库交互接口，相当于DAO层
 *
 * @author fanghan
 */
public interface AccountMapper {
    /**
     * 根据用户名和密码获取用户信息
     *
     * @param params 查询参数
     * @return 用户
     */
    Account queryByUsernameAndPassword(LoginVO params);

    /**
     * 根据用户名获取用户信息
     *
     * @param username 用户名
     * @return 用户
     */
    Account queryByUsername(@Param("username") String username);
}
