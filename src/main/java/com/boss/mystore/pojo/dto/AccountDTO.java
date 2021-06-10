package com.boss.mystore.pojo.dto;

import lombok.Data;

/**
 * DTO类
 *
 * @author fanghan
 */
@Data
public class AccountDTO {
    private String username;
    private String city;
    private String country;
    private Long zip;
    private Long phone;
    private String address;
}
