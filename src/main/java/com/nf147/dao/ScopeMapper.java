package com.nf147.dao;

import com.nf147.entity.Scope;
import java.util.List;

public interface ScopeMapper {
    int deleteByPrimaryKey(String scopeID);

    int insert(Scope record);

    Scope selectByPrimaryKey(String scopeID);

    List<Scope> selectAll();

    int updateByPrimaryKey(Scope record);
}