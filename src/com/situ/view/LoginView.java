package com.situ.view;
import com.situ.service.GmsService;
import java.util.Scanner;
import  com.situ.entity.Adm;
import  com.situ.service.AdmService;
import com.situ.service.GmsService;
import com.situ.entity.Gms;

public class LoginView {

    AdmService ad=new AdmService();

    public void login(Scanner sc){

            System.out.println("---------欢迎登录游戏平台信息管理系统-------");
            System.out.println("------------------1、登录------------------");
            System.out.println("------------------2、退出------------------");
            System.out.println("请输入要进行的操作：");
            String s=sc.next();
        switch (s){
            case "1":
                System.out.println("请输入管理员名：");
                String name = sc.next();
                System.out.println("请输入密码：");
                String pwd = sc.next();

                /*访问数据库，通过用户名、密码去数据库中查找*/
                Adm admin = ad.login(name,pwd);

                /*密码错误重试*/
                if(admin == null){
                    System.out.println("密码错误，请重试！");
                    login(sc);
                }
                break;
            case "2" :
                System.out.println("已退出");
                break;
            default:
                System.out.println("输入有误，请重新输入！");
                login(sc);
                break;
        }






    }



}
