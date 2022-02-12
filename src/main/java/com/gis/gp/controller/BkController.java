package com.gis.gp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by GIS on 2022/2/12.
 * 板块基本信息接口
 */
@Controller
@RequestMapping("/bk")
public class BkController {
    @RequestMapping("/index")
    public String showBkIndex(){
        return "bk";
    }
}
