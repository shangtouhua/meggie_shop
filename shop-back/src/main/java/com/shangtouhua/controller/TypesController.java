package com.shangtouhua.controller;

import com.shangtouhua.entity.Types;
import com.shangtouhua.service.api.ITypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018\9\26 0026.
 */
@Controller
@RequestMapping("/types")
public class TypesController {

    @Autowired
    private ITypesService typesServiceImpl;

    @RequestMapping("/typesManager")
    public String typesManager(Model model){
        List<Types> typesList = typesServiceImpl.queryAll();
        model.addAttribute("typesList",typesList);
        System.out.println("获取到分类"+typesList);
        return "typesList";
    }
}
