package com.situ.util;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBUtil {
    private static Properties pt = null;
    private static Connection conn = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    // 静态代码块：当DBUitl类第一次被调用的时候执行，并且只执行一次。这里面的代码不用人为调用，会自动调用
    static {
        // 读取属性文件获取数据库连接信息
        pt = new Properties();
        try {
            pt.load(DBUtil.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 加载驱动
        try {
            Class.forName(pt.getProperty("driver"));
        } catch (ClassNotFoundException e) {
            System.out.println("驱动加载失败");
            e.printStackTrace();
        }
    }

    // 获取连接对象
    private static void getConnection() {
        try {
            conn = DriverManager.getConnection(pt.getProperty("url"),pt.getProperty("user"),pt.getProperty("pwd"));
        } catch (SQLException e) {
            System.out.println("获取连接失败");
            e.printStackTrace();
        }
    }
    // 获取命令
    private static void getPreparedStatement(String sql,Object...params) {
        getConnection();
        try {
            ps = conn.prepareStatement(sql);
            if (params !=null) { // 设置参数
                for (int i = 0; i < params.length; i++) {
                    ps.setObject(i+1,params[i]);
                }
            }
        } catch (SQLException e) {
            System.out.println("获取命令失败");
            e.printStackTrace();
        }
    }
    // 增删改
    public static int update(String sql,Object...params) {
        int num = 0;
        getPreparedStatement(sql,params);
        try {
            num = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("更新不成功");
            e.printStackTrace();
        }finally {
            // 关闭连接
            close();
        }
        return num;
    }
    // 查询
    public static ResultSet query(String sql,Object...params) {
        getPreparedStatement(sql,params);
        try {
            rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("查询不成功");
            e.printStackTrace();
        }
        return rs;
    }
    // 关闭所有连接
    public static void close() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
