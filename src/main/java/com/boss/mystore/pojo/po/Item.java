package com.boss.mystore.pojo.po;


import lombok.Data;

/**
 * PO类，对应数据库的Item表
 *
 * @author fanghan
 */
@Data
public class Item {

  private String itemId;
  private Double listPrice;
  private String description;

}
