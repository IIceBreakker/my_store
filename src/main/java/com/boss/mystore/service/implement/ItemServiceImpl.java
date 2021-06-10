package com.boss.mystore.service.implement;

import cn.hutool.core.bean.BeanUtil;
import com.boss.mystore.pojo.dto.ItemDTO;
import com.boss.mystore.pojo.po.Item;
import com.boss.mystore.mapper.ItemMapper;
import com.boss.mystore.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @author fanghan
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemMapper itemMapper;

    @Override
    public Item getItemById(String itemId) {
        return itemMapper.queryById(itemId);
    }

//    @Override
//    public ArrayList<Item> listCartItemsByUsername(String username) {
//        return null;
//    }

    @Override
    public ArrayList<ItemDTO> listAllItems() {
        ArrayList<ItemDTO> itemDTOList = new ArrayList<>();
        ItemDTO temp = new ItemDTO();
        for (Item item : itemMapper.queryAll()) {
            BeanUtil.copyProperties(item, temp);
            itemDTOList.add(temp);
        }
        return itemDTOList;
    }
}
