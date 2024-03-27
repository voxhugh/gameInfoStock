package com.situ.view;
import com.situ.entity.Gms;
import com.situ.entity.Suppliers;
import com.situ.service.SuppliersService;

import java.util.List;
import java.util.Scanner;

public class SuppliersMgrView {
    SuppliersService sp=new SuppliersService();
    /*查询*/
    public void queryView(Scanner sc){

        sc=new Scanner(System.in);
        System.out.println("输入要查询的发行商关键词");
        String str = sc.nextLine();
        System.out.println("发行商列表如下：");
        System.out.println("发行商\t\t\t\t开发商\t\t游戏数\t\t均价\t\t受欢迎度");
        List<Suppliers> list = sp.query(str);
        for (Suppliers sp:list) {
            System.out.println(sp.getPublisher()+"\t\t"+sp.getDeveloper()+"\t\t"+sp.getGmcount()+"\t\t"+
                    sp.getAvgprice()+"\t\t"+sp.getLikes());
        }

    }
}