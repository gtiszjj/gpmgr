package com.gis.gp.dao;

import com.gis.gp.entity.BkDayInfo;
import com.gis.gp.entity.BkInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by GIS on 2022/2/12.
 */
@Mapper
public interface IBkInfo {
    // 查询每个板块每天排名信息
    public List<BkInfo> getBkInfo();

    // 查询距离上次领跑间隔的天数
    public List<BkDayInfo> getBkDayInfo();
}
