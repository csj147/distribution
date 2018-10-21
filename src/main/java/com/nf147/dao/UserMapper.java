package com.nf147.dao;

import com.nf147.entity.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String userID);

    int insert(User record);

    User selectByPrimaryKey(String userID);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}