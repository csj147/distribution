package com.nf147.dao;

import com.nf147.entity.Client;
import java.util.List;

public interface ClientMapper {
    int deleteByPrimaryKey(String clientID);

    int insert(Client record);

    Client selectByPrimaryKey(String clientID);

    List<Client> selectAll();

    int updateByPrimaryKey(Client record);
}