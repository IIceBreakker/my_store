package com.boss.mystore.response.constant;

/**
 * @author fanghan
 */

public enum MessageEnum {

    /**
     * 登录成功
     */
    LOGIN_SUCCESS("登录成功"),

    /**
     * 登录失败
     */
    LOGIN_FAILURE("登录失败"),

    /**
     * 成功获取所有商品信息
     */
    ITEM_LIST_SUCCESS("成功获取所有商品信息"),

    /**
     * 成功创建订单
     */
    CREATE_ORDER_SUCCESS("成功创建订单"),

    /**
     * 创建订单失败
     */
    CREATE_ORDER_FAILURE("创建订单失败");

    private String msg;
    MessageEnum(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
