package com.situ.view;

import com.situ.entity.Gms;
import com.situ.service.GmsService;
import com.situ.util.DBUtil;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GmsMgrView {

    GmsService gmsService = new GmsService();

    /*添加*/
    public void addView(Scanner sc){

        System.out.println("输入游戏名称：");
        String name=sc.next();
        System.out.println("输入游戏价格：");
        Double price=sc.nextDouble();
        System.out.println("输入游戏史地：");
        Double lprice=sc.nextDouble();
        System.out.println("输入好评率：");
        int lkrate=sc.nextInt();
        System.out.println("输入月均在线人数：");
        long monline=sc.nextLong();
        System.out.println("输入平均游戏时间：");
        float avgtime=sc.nextFloat();
        System.out.println("输入开发商：");
        String developer=sc.next();
        System.out.println("输入发行商：");
        String publisher=sc.next();


        /*JDBC*/
        Gms gms = new Gms();
        gms.setName(name);
        gms.setPrice(price);
        gms.setLprice(lprice);
        gms.setLkrate(lkrate);
        gms.setMonline(monline);
        gms.setAvgtime(avgtime);
        gms.setDeveloper(developer);
        gms.setPublisher(publisher);


        boolean bl = gmsService.add(gms);
        if(bl){
            System.out.println("添加游戏成功！");
        }else{
            System.out.println("添加游戏失败！！！");
        }



    }

    /*删除*/
    public void deleteView(Scanner sc){

        System.out.println("请输入要删除的游戏名全称：");
        String name = sc.next();
        Gms gms = new Gms();
        gms.setName(name);

        boolean bl = gmsService.delete(gms);
        if(bl){
            System.out.println("删除用户游戏！");
        }else{
            System.out.println("删除游戏失败！！！");
        }


    }

    /*修改*/
    public void updateView(Scanner sc){

        System.out.println("输入要修改的游戏名全称：");
        String name=sc.next();
        System.out.println("输入管理员名：");
        String userName=sc.next();
        System.out.println("输入密码：");
        String pwd=sc.next();

        Gms gms=new Gms();
        double price=0.0;
        double lprice=0.0;
        int lkrate=0;
        long monline=0;
        float avgtime=0.0f;
        String developer="";
        String publisher="";

        gms.setName(name);
        System.out.println("价格修改");
        gms.setPrice(price);
        System.out.println("史低更新");
        gms.setLprice(lprice);
        System.out.println("好评率更新");
        gms.setLkrate(lkrate);
        System.out.println("月均在线人数更新");
        gms.setMonline(monline);
        System.out.println("平均游戏时间更新");
        gms.setAvgtime(avgtime);
        System.out.println("开发商修改");
        gms.setPublisher(developer);
        System.out.println("发行商修改");
        gms.setPublisher(publisher);

        boolean bl = gmsService.update(gms);
        if(bl){
            System.out.println("游戏信息更新成功！");
        }else{
            System.out.println("更新失败！！！");
        }

    }

    /*查询*/
    public void queryView(Scanner sc){

        sc=new Scanner(System.in);
        System.out.println("输入要查询的游戏名关键词");
        String cdt ="where name like '%"+sc+"%'";
        System.out.println("游戏列表如下：");
        System.out.println("游戏id\t\t名称\t\t价格\t\t史低\t\t好评率\t\t月均在线\t\t平均时长\t\t开发商\t\t发行商");
        List<Gms> list = gmsService.query(cdt);
        for (Gms gm:list) {
            System.out.println(gm.getId()+"\t\t"+gm.getName()+"\t\t"+gm.getPrice()+"\t\t"+gm.getLprice()+
                    "\t\t"+gm.getLprice()+"\t\t"+gm.getLkrate()+"\t\t"+gm.getMonline()+"\t\t"+gm.getAvgtime()+
                    "\t\t"+gm.getDeveloper()+"\t\t"+gm.getPublisher());
        }






    }

}
