package com.situ.dao;

import com.situ.entity.Adm;
import com.situ.entity.Gms;
import com.situ.entity.Suppliers;
import com.situ.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SuppliersDao {

    /*供应商查询*/
    public List<Suppliers> query(String cdt) throws SQLException{
            /*1、sql语句、模糊查询条件*/
            String sql="SELECT * FROM SUPPLIERS where PUBLISHER like '%" + cdt + "%'";
            /*2、调用DBUil中的query方法，并传递参数*/
            ResultSet rs = DBUtil.query(sql);

            List<Suppliers> list = new ArrayList<>();

            while(rs.next()){
                Suppliers sup = new Suppliers();


                sup.setDeveloper(rs.getString("developer"));
                sup.setPublisher(rs.getString("publisher"));
                sup.setGmcount(rs.getInt("gmcount"));
                sup.setAvgprice(rs.getDouble("avgprice"));
                sup.setLikes(rs.getInt("likes"));

                list.add(sup);
            }
            return list;

        }

}
