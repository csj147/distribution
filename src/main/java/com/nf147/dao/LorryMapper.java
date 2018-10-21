package com.nf147.dao;

import com.nf147.entity.Lorry;
import java.util.List;

public interface LorryMapper {
    int deleteByPrimaryKey(String lorryID);

    int insert(Lorry record);

    Lorry selectByPrimaryKey(String lorryID);

    List<Lorry> selectAll();

    int updateByPrimaryKey(Lorry record);
}