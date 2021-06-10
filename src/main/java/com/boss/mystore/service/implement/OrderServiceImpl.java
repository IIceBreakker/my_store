package com.boss.mystore.service.implement;

import com.boss.mystore.pojo.po.Order;
import com.boss.mystore.mapper.OrderMapper;
import com.boss.mystore.pojo.vo.OrderVO;
import com.boss.mystore.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author fanghan
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public int createOrder(OrderVO order) {
        return orderMapper.insert(order);
    }
}
