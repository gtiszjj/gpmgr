package com.gis.gp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gis.gp.entity.BkDayInfo;
import com.gis.gp.entity.BkInfo;
import com.gis.gp.service.BkInfoService;
import com.gis.gp.service.impl.BkInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by GIS on 2022/2/12.
 * 板块基本信息接口
 */
@Controller
@RequestMapping("/bk")
public class BkController {
    @Autowired
    private BkInfoService bkInfoService;

    @RequestMapping("/index")
    public String showBkIndex(){
        return "bk";
    }

    @RequestMapping("/indexdays")
    public String showBkDaysIndex(){
        return "bkday";
    }

    @RequestMapping("/getBkInfo")
    @ResponseBody
    public String getBkInfo() throws JsonProcessingException {
        List<BkInfo> lstResult = bkInfoService.getBkInfo();
        ObjectMapper mapper = new ObjectMapper();
        String sResult = mapper.writeValueAsString(lstResult);
        return sResult;
    }

    @CrossOrigin
    @RequestMapping("/getBkDayInfo")
    @ResponseBody
    public String getBkDayInfo() throws JsonProcessingException {
        List<BkDayInfo> lstResult = bkInfoService.getBkDayInfo();
        ObjectMapper mapper = new ObjectMapper();
        String sResult = mapper.writeValueAsString(lstResult);

        // layui table 规定格式
        sResult = "{\"code\":0,\"msg\":\"\",\"count\":" + lstResult.size() + ",\"data\":" + sResult + "}";

        return sResult;
    }
}
