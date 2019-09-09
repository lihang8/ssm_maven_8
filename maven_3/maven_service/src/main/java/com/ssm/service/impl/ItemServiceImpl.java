package com.ssm.service.impl;

import com.ssm.mapper.ItemsMapper;
import com.ssm.pojo.Items;
import com.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemServiceImpl  implements ItemService {
    @Autowired
    private ItemsMapper itemsMapper;


    @Override
    public Items findByid(Integer id) {
        Items items = itemsMapper.findById(id);
        return items;
    }
}
