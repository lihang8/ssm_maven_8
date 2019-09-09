package com.ssm.controller;

import com.lihang.utils.MyDateUtils;
import com.ssm.pojo.Items;
import com.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/item")
@Controller
public class ItemController {

    @Autowired
private ItemService itemService;



    @RequestMapping("/list")
    public  String  list(Model model){


        Items items = itemService.findByid(1);
        model.addAttribute("item",items);
        return "list";

    }



}
