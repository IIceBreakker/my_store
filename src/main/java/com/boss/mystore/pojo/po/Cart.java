package com.boss.mystore.pojo.po;


import lombok.Data;

/**
 * PO类，对应数据库的Cart表
 *
 * @author fanghan
 */
@Data
public class Cart {

  private Long id;
  private String username;
  private String itemId;
  private Long quantity;

}
