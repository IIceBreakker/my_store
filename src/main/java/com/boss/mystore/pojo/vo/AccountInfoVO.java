package com.boss.mystore.pojo.vo;

import com.boss.mystore.pojo.dto.AccountDTO;
import lombok.Getter;
import lombok.Setter;

/**
 * VO类，用于返回，封装用户信息的视图数据
 *
 * @author fanghan
 */
@Getter
@Setter
public class AccountInfoVO extends AccountDTO {

    /**
     * 要在第一次登录后返回给前端，所以token字段写在这里
     */
    private String token;
}
