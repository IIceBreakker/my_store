package com.boss.mystore.service;

import com.boss.mystore.pojo.dto.AccountDTO;
import com.boss.mystore.pojo.vo.LoginVO;


/**
 * Service层，Account模块的Service
 *
 * @author fanghan
 */
public interface AccountService {
    /**
     * 获取用户信息
     *
     * @return 用户
     */
    AccountDTO getUser(LoginVO params);
}
