package com.situ;

import com.situ.util.AdmUtil;
import com.situ.view.GmsMgrView;
import com.situ.view.LoginView;
import com.situ.view.SuppliersMgrView;
//import jdk.nashorn.internal.ir.CallNode;

import java.util.Scanner;

public class Main {

    /*实例化菜单*/
    GmsMgrView gmv = new GmsMgrView();
    SuppliersMgrView smv = new SuppliersMgrView();

    public static void main(String[] args) {
        /*创建控制台输入对象*/
        Scanner sc = new Scanner(System.in);
        /*页面登录*/
        LoginView loginView = new LoginView();
        loginView.login(sc);

        /*密码正确调用menu方法*/
        if (AdmUtil.adm != null) {
            new Main().menu(sc);
        }

    }


    /*主菜单*/
    public void menu(Scanner sc) {
        System.out.println(AdmUtil.adm.getUserName() + "，欢迎您！");
        System.out.println("-----------1、游戏信息管理------------");
        System.out.println("-----------2、开发商信息管理---------");
        System.out.println("-----------3、退出系统-----------");

        System.out.println("请输入要进行的操作：");
        String opt = sc.next();

        switch (opt) {

            case "1":
                gmsMenu(sc);
                break;
            case "2":
                suppliersMenu(sc);
                break;
            case "3":
                break;
        }


    }


    /*游戏信息管理界面*/
    public void gmsMenu(Scanner sc) {

        System.out.println("欢迎来到游戏信息管理界面");
        System.out.println("------1、查询游戏信息------");
        System.out.println("------2、添加游戏信息------");//
        System.out.println("------3、修改游戏信息------");//
        System.out.println("------4、删除游戏信息------");//
        System.out.println("------5、返回上一级--------");

        System.out.println("请输入要进行的操作：");
        String opt = sc.next();

        switch (opt) {

            case "1":
                gmv.queryView(sc);
                break;
            case "2":
                gmv.addView(sc);
                break;
            case "3":
                gmv.updateView(sc);
                break;
            case "4":
                gmv.deleteView(sc);
                break;
            case "5":
                menu(sc);
                break;
        }


    }

    /*开发商管理界面*/
    public void suppliersMenu(Scanner sc){

        System.out.println("欢迎来到开发商信息管理界面");
        System.out.println("------1、查询开发商信息------");
        System.out.println("------2、返回上一级--------");

        System.out.println("请输入要进行的操作：");
        String opt = sc.next();

        switch (opt) {

            case "1":
                smv.queryView(sc);
                break;
            case "2":
                menu(sc);
                break;
        }


    }

}