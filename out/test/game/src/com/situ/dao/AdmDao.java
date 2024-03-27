package com.situ.dao;

import com.situ.entity.Adm;
import com.situ.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdmDao {
    /*管理员登录*/
    public Adm login(String userName, String pwd) throws SQLException {
        /*1、sql语句*/
        String sql="SELECT * FROM adm WHERE userName=? AND pwd=?";
        /*2、调用DBUil中的query方法，并传递参数*/
        ResultSet rs = DBUtil.query(sql,userName,pwd);

        Adm admin =null;
        /*3、处理返回结果，封装成对象*/
        while(rs.next()){
            admin=new Adm();

            /*rs读取数据的方法主要是getXXX() ，他的参数可以使整型表示第几列（是从1开始的），还可以是列名*/
            admin.setUserName(rs.getString("userName"));
            admin.setPwd(rs.getString("pwd"));

        }
        return admin ;

    }
}
