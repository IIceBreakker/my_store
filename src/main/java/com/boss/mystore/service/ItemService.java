package com.boss.mystore.service;

import com.boss.mystore.pojo.dto.ItemDTO;
import com.boss.mystore.pojo.po.Item;

import java.util.ArrayList;

/**
 * @author fanghan
 */
public interface ItemService {

    /**
     * 根据商品Id得到某一条商品信息
     *
     * @param itemId 商品Id
     * @return 特定商品信息
     */
    Item getItemById(String itemId);

//    /**
//     * 获取当前用户的当前购物车商品列表
//     *
//     * @param username 用户名
//     * @return 用户当前购物车商品列表
//     */
//    ArrayList<Item> listCartItemsByUsername(String username);

    /**
     * 得到所有商品信息
     *
     * @return 所有商品信息
     */
    ArrayList<ItemDTO> listAllItems();
}
