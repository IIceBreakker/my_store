package com.boss.mystore.pojo.po;


import lombok.Data;

/**
 * PO类，对应数据库的Account表
 *
 * @author fanghan
 */
@Data
public class Account {

  private String username;
  private String password;
  private String city;
  private String country;
  private Long zip;
  private Long phone;
  private String address;

}
