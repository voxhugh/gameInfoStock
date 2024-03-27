<%@ page import="com.situ.entity.Gms" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head></head>
<body>

<table border="1" cellspacing="0">
    <tr>
        <td>ID</td>
        <td>名称</td>
        <td>价格</td>
        <td>史低</td>
        <td>好评率</td>
        <td>月均在线人数</td>
        <td>平均游戏时间</td>
        <td>开发商</td>
        <td>发行商</td>
    </tr>
    <%
        // 里面可以写任意的java代码--jsp脚本
        ArrayList<Gms> list = (ArrayList<Gms>) request.getAttribute("list");
        for (Gms g : list) {
    %>
    <tr>
        <td><%=g.getId()%></td>
        <td><%=g.getName()%>></td>
        <td><%=g.getPrice()%>></td>
        <td><%=g.getLprice()%>></td>
        <td><%=g.getLkrate()%>></td>
        <td><%=g.getMonline()%>></td>
        <td><%=g.getAvgtime()%>></td>
        <td><%=g.getDeveloper()%>></td>
        <td><%=g.getPublisher()%>></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>