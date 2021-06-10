package com.boss.mystore.pojo.vo;

import lombok.Data;

import java.util.Date;

/**
 * VO类，用于请求，封装前端订单数据请求
 *
 * @author fanghan
 */
@Data
public class OrderVO {
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
