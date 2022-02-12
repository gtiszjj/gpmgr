package com.gis.gp.service;

import com.gis.gp.entity.BkDayInfo;
import com.gis.gp.entity.BkInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GIS on 2022/2/12.
 */
public interface BkInfoService {
    public List<BkInfo> getBkInfo();

    public List<BkDayInfo> getBkDayInfo();
}
