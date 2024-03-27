package com.situ.service;

import com.situ.dao.AdmDao;
import com.situ.entity.Adm;
import com.situ.util.AdmUtil;

import java.sql.SQLException;

public class AdmService {
    AdmDao ad = new AdmDao();
    //管理员登录
    public Adm login(String userName, String pwd){
        Adm admin=null;
        try{
            admin= ad.login(userName,pwd);
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
        /*用户和密码正确，需要保存管理员信息到系统中*/
        if(admin != null){
            //备份管理员信息
            AdmUtil.adm=admin;
        }

        return admin;
    }
}
