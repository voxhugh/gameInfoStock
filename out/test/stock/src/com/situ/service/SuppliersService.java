package com.situ.service;

import com.situ.dao.GmsDao;
import com.situ.dao.SuppliersDao;
import com.situ.entity.Adm;
import com.situ.entity.Gms;
import com.situ.entity.Suppliers;
import com.situ.util.AdmUtil;

import java.sql.SQLException;
import java.util.List;

public class SuppliersService {

    SuppliersDao sd=new SuppliersDao();

    //查询
    public List<Suppliers> query(String cdt) {
        try {
            return sd.query(cdt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}