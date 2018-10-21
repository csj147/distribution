package com.nf147.dao;

import com.nf147.entity.OrderList;
import java.util.List;

public interface OrderListMapper {
    int deleteByPrimaryKey(String orderID);

    int insert(OrderList record);

    OrderList selectByPrimaryKey(String orderID);

    List<OrderList> selectAll();

    int updateByPrimaryKey(OrderList record);
}