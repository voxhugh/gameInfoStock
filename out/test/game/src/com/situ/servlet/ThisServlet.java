package com.situ.servlet;


import com.situ.entity.Gms;
import com.situ.view.GmsMgrView;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


// http://localhost:8080/JavaWeb/hello
@WebServlet("/thisServlet")
public class ThisServlet extends HttpServlet {

    // 访问Servlet默认访问service方法
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ThisServlet.service");
        GmsMgrView gmv= new GmsMgrView();
        Scanner sc=null;
        List<Gms> list=gmv.queryView(sc);

        // 把list数据放到一块内存区域里面
        req.setAttribute("list", list);
        // 跳转到gameWeb.jsp展示数据
        // dispatch: 分发
        req.getRequestDispatcher("gameWeb.jsp").forward(req, resp);
    }
}

