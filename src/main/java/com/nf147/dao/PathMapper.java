package com.nf147.dao;

import com.nf147.entity.Path;
import java.util.List;

public interface PathMapper {
    int deleteByPrimaryKey(String pathID);

    int insert(Path record);

    Path selectByPrimaryKey(String pathID);

    List<Path> selectAll();

    int updateByPrimaryKey(Path record);
}