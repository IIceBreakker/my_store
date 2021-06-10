package com.boss.mystore.service;

import com.boss.mystore.pojo.vo.OrderVO;

/**
 * @author fanghan
 */
public interface OrderService {
    /**
     * 创建订单
     *
     * @param order 要创建的订单
     * @return 返回创建订单的结果
     */
    int createOrder(OrderVO order);
}
