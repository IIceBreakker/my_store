package com.boss.mystore.mapper;

import com.boss.mystore.pojo.dto.ItemDTO;
import com.boss.mystore.pojo.po.Item;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * Item模块数据库交互接口，相当于DAO层
 *
 * @author fanghan
 */
public interface ItemMapper {

    /**
     * 根据itemId字段列出该记录信息
     *
     * @param itemId itemId字段
     * @return 记录为空或者一条
     */
    Item queryById(@Param("itemId") String itemId);

    /**
     * @param username Cart表字段名称
     * @return 记录列表
     */
//    ArrayList<Item> queryAllByUsername(@Param("username") String username);

    /**
     * 列出该表所有记录
     *
     * @return 所有记录
     */
    ArrayList<Item> queryAll();
}
