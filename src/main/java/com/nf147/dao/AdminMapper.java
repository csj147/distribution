package com.nf147.dao;

import com.nf147.entity.Admin;
import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(String adminID);

    int insert(Admin record);

    Admin selectByPrimaryKey(String adminID);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);
}