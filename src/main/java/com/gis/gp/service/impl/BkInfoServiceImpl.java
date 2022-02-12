package com.gis.gp.service.impl;

import com.gis.gp.dao.IBkInfo;
import com.gis.gp.entity.BkDayInfo;
import com.gis.gp.entity.BkInfo;
import com.gis.gp.service.BkInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GIS on 2022/2/12.
 */
@Service
public class BkInfoServiceImpl implements BkInfoService {
    @Autowired
    private IBkInfo bkInfo = null;

    @Override
    public List<BkInfo> getBkInfo() {
        return bkInfo.getBkInfo();
    }

    @Override
    public List<BkDayInfo> getBkDayInfo() {
        return bkInfo.getBkDayInfo();
    }
}
