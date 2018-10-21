package com.nf147.dao;

import com.nf147.entity.Area;
import java.util.List;

public interface AreaMapper {
    int deleteByPrimaryKey(String areaID);

    int insert(Area record);

    Area selectByPrimaryKey(String areaID);

    List<Area> selectAll();

    int updateByPrimaryKey(Area record);
}