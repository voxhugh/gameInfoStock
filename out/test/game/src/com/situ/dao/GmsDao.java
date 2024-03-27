package com.situ.dao;
import com.situ.entity.Gms;
import com.situ.entity.Adm;
import com.situ.util.DBUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GmsDao {

    /*游戏添加*/
    public boolean add(Gms gms){

        Object param[] = {gms.getId(),gms.getName(),gms.getPrice(),gms.getLprice(),gms.getLkrate(),gms.getMonline()};
        /*1、sql语句*/
        String sql = "insert into gms(name,price,lprice,lkrate,monline,avgtime,developer,publisher) values(?,?,?,?,?,?,?,?) ";
        /*调用DBUtil里的update方法*/

        return DBUtil.update(sql,param)>0;

    }

    /*游戏信息修改*/
    public boolean update(Gms gms){
        Object param[] = {gms.getName(),gms.getPrice(),gms.getLprice(),gms.getLkrate(),gms.getMonline(),
                gms.getAvgtime(),gms.getDeveloper(),gms.getPublisher()};
        /*1、sql语句*/
        String sql = "update gms set name =?,price=?,lprice=?,lkrate=?,monline=?,avgtime=?," +
                "developer=?,publisher=? where name=?";
        /*调用DBUtil里的update方法*/

        return DBUtil.update(sql,param)>0;
    }

    /*游戏删除*/
    public boolean delete(Gms gms){
        /*1、sql语句*/
        String sql = "delete from gms where name=?";
        /*调用DBUtil里的update方法*/

        return DBUtil.update(sql,gms.getName())>0;

    }

    /*游戏查询*/
    public List<Gms> query(String cdt) throws SQLException{

        /*1、sql语句、模糊查询条件*/
        String sql="SELECT * FROM GMS where name like '%" + cdt + "%'";
        /*2、调用DBUil中的query方法，并传递参数*/
        ResultSet rs = DBUtil.query(sql);
        List<Gms> list = new ArrayList<>();

        while(rs.next()){
            Gms gms = new Gms();

            gms.setId(rs.getInt("id"));
            gms.setName(rs.getString("name"));
            gms.setPrice(rs.getDouble("price"));
            gms.setLprice(rs.getDouble("lprice"));
            gms.setLkrate(rs.getInt("lkrate"));
            gms.setMonline(rs.getInt("monline"));
            gms.setAvgtime(rs.getFloat("avgtime"));
            gms.setDeveloper(rs.getString("developer"));
            gms.setPublisher(rs.getString("publisher"));

            list.add(gms);
        }
        return list;

    }

}
