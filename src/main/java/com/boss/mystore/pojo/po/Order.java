package com.boss.mystore.pojo.po;


import lombok.Data;

import java.util.Date;

/**
 * PO类，对应数据库的Order表
 *
 * @author fanghan
 */
@Data
public class Order {

  private Long orderId;
  private String username;
  private Double totalPrice;
  private Long cardNumber;
  private String cardType;
  private String shipAddr;
  private String shipName;
  private Long shipPhone;
  private Date orderDate;

}
