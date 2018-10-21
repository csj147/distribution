package com.nf147.dao;

import com.nf147.entity.Province;
import java.util.List;

public interface ProvinceMapper {
    int deleteByPrimaryKey(String provinceID);

    int insert(Province record);

    Province selectByPrimaryKey(String provinceID);

    List<Province> selectAll();

    int updateByPrimaryKey(Province record);
}