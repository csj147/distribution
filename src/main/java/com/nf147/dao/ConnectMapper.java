package com.nf147.dao;

import com.nf147.entity.Connect;
import java.util.List;

public interface ConnectMapper {
    int deleteByPrimaryKey(String connectID);

    int insert(Connect record);

    Connect selectByPrimaryKey(String connectID);

    List<Connect> selectAll();

    int updateByPrimaryKey(Connect record);
}