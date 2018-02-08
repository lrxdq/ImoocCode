package com.ldq.imooc.module1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author:lidaoquan
 * @description:
 * @date: Created in 2018/1/18
 * @modified by:
 */
public class DBUtil {

    //1.加载驱动
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    //2.连接地址URL
    private static final String url = "jdbc:mysql:///imooc?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    //3.账号密码
    private static final String user = "root";
    private static final String password = "root";

    private static Connection connection = null;

    //加载驱动
    static {
        try {
            Class.forName(driver);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //单例模式返回数据库连接对象
    public static Connection getConnection() throws SQLException {

        if (connection == null) {
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        }
        return connection;
    }

    public static void main(String[] args) {

        try {
            Connection connection = DBUtil.getConnection();
            if (connection != null) {
                System.out.println("数据库连接成功");
            } else {
                System.out.println("数据库连接失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
