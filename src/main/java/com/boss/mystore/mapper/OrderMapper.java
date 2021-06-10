package com.boss.mystore.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * Order模块数据库交互接口，相当于DAO层
 *
 * @author fanghan
 */
public interface OrderMapper {
    /**
     * 插入一个order记录
     * @param order 需要插入的记录
     * @return 操作影响的行数
     */
    int insert(@Param("param") Object param);
}
