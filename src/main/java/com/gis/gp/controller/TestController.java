package com.gis.gp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by GIS on 2022/2/12.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "success test.";
    }
}
