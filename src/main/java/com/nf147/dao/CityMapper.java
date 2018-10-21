package com.nf147.dao;

import com.nf147.entity.City;
import java.util.List;

public interface CityMapper {
    int deleteByPrimaryKey(String cityID);

    int insert(City record);

    City selectByPrimaryKey(String cityID);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
}