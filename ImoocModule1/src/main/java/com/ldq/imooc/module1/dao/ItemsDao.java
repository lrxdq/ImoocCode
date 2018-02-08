package com.ldq.imooc.module1.dao;

import com.ldq.imooc.module1.entity.Items;
import com.ldq.imooc.module1.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/18
 * @modified by:
 */
public class ItemsDao {

    //获取所有商品列表
    public ArrayList<Items> getAllItems() {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<Items> itemsArrayList = new ArrayList<Items>();
        try {

            connection = DBUtil.getConnection();
            String sql = "select * from items";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Items item = new Items();
                item.setId(resultSet.getInt("id"));
                item.setCity(resultSet.getString("city"));
                item.setName(resultSet.getString("name"));
                item.setNumber(resultSet.getInt("number"));
                item.setPrice(resultSet.getInt("price"));
                item.setPicture(resultSet.getString("picture"));

                itemsArrayList.add(item);
            }
            return itemsArrayList;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {

            //释放数据集对象
            if (resultSet != null) {
                try {
                    resultSet.close();
                    resultSet = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            //释放语句集对象
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                    preparedStatement = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
