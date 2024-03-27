package com.situ.service;

import com.situ.dao.GmsDao;
import com.situ.entity.Gms;
import com.situ.util.AdmUtil;
import com.situ.util.DBUtil;
import com.situ.entity.Adm;

import java.sql.SQLException;
import java.util.List;

public class GmsService {

    GmsDao gmsDao=new GmsDao();

    //添加
    public boolean add(Gms gms){

        return gmsDao.add(gms);
    }
    //修改
    public boolean update(Gms gms){

        return gmsDao.update(gms);
    }
    //删除
    public boolean delete(Gms gms) {

        return gmsDao.delete(gms);
    }
    //查询
    public List<Gms> query(String cdt){
        try {
            return gmsDao.query(cdt);
        } catch (SQLException e) {
            e.printStackTrace();
        }return null;

    }
}
