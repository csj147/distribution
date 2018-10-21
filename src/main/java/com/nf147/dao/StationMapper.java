package com.nf147.dao;

import com.nf147.entity.Station;
import java.util.List;

public interface StationMapper {
    int deleteByPrimaryKey(String stationID);

    int insert(Station record);

    Station selectByPrimaryKey(String stationID);

    List<Station> selectAll();

    int updateByPrimaryKey(Station record);
}