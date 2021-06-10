package com.boss.mystore.service.implement;

import cn.hutool.core.bean.BeanUtil;
import com.boss.mystore.pojo.dto.AccountDTO;
import com.boss.mystore.mapper.AccountMapper;
import com.boss.mystore.pojo.po.Account;
import com.boss.mystore.pojo.vo.LoginVO;
import com.boss.mystore.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author fanghan
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public AccountDTO getUser(LoginVO params) {
        AccountDTO accountDTO = new AccountDTO();
        BeanUtil.copyProperties(accountMapper.queryByUsernameAndPassword(params), accountDTO, "password");
        return accountDTO;
    }
}
