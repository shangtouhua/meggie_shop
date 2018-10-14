package com.shangtouhua.controller;

import com.shangtouhua.entity.Goods;
import com.shangtouhua.service.api.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018\10\6 0006.
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    @RequestMapping("/goodsManager")
    public String goodsController(Model model){
        List<Goods> goodsList = goodsService.queryGoodsPage();
        System.out.println(goodsList);
        model.addAttribute("goodsList",goodsList);
        return "goodList";
    }
}
