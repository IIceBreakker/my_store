package com.boss.mystore.controller;

import cn.hutool.core.bean.BeanUtil;

import com.boss.mystore.anno.PassToken;
import com.boss.mystore.pojo.dto.AccountDTO;
import com.boss.mystore.pojo.dto.ItemDTO;
import com.boss.mystore.pojo.vo.AccountInfoVO;
import com.boss.mystore.pojo.vo.LoginVO;
import com.boss.mystore.pojo.vo.OrderVO;
import com.boss.mystore.response.JSONResult;
import com.boss.mystore.service.AccountService;
import com.boss.mystore.service.ItemService;
import com.boss.mystore.service.OrderService;
import com.boss.mystore.util.GenerateUUID;
import com.boss.mystore.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * 这个类是Controller类，提供后台接口，因为本次作业的几个请求比较轻量级的缘故，
 * 我将这些请求处理放在了一个类里，没有分成多个模块的Controller类，后续会继续更改
 *
 * @author fanghan
 */
@CrossOrigin
@RestController
public class StoreController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private OrderService orderService;

    /**
     * 登录接口
     *
     * @param params 登录参数
     * @return res 成功或者失败返回相应的信息
     */
    @PassToken
    @PostMapping("/login")
    public JSONResult<AccountInfoVO> login(@RequestBody LoginVO params) {
        AccountInfoVO accountInfoVO = new AccountInfoVO();

        //to-do params校验
        AccountDTO accountDTO = accountService.getUser(params);

        if (accountDTO != null) {
            //将accountDTO的数据复制到accountVO中
            BeanUtil.copyProperties(accountDTO, accountInfoVO);
            //第一次登录设置token属性
            accountInfoVO.setToken(JwtUtil.generateToken(accountDTO));
            return JSONResult.success(accountInfoVO);
        } else {
            return JSONResult.fail();
        }
    }

    /**
     * 主界面数据接口，返回的是所有商品数据
     *
     * ItemDTO，Item，ItemVO的数据重合很多，时间有限，没有定义ItemVO，后续会跟进
     *
     * @return res 成功或者失败返回相应的信息
     */
    @GetMapping("/main")
    public JSONResult<ArrayList<ItemDTO>> main() {
        ArrayList<ItemDTO> itemList = itemService.listAllItems();
        return JSONResult.success(itemList);
    }

    /**
     * 创建订单接口
     *
     * @param params 订单信息
     * @return 创建订单成功或者失败的信息
     */
    @PostMapping("/order/create")
    public JSONResult<Integer> createOrder(@RequestBody OrderVO params) {
        params.setOrderId(GenerateUUID.getUUID());
        int result = orderService.createOrder(params);
        if (result == 1) {
            return JSONResult.success();
        } else {
            return JSONResult.fail();
        }
    }
}
