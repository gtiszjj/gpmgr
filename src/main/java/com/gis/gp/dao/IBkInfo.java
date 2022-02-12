package com.gis.gp.dao;

import com.gis.gp.entity.BkInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by GIS on 2022/2/12.
 */
@Mapper
public interface IBkInfo {
    public List<BkInfo> getBkInfo();
}
