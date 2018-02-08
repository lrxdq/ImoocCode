<%--
  Created by IntelliJ IDEA.
  User: lidq
  Date: 2018/1/18
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%@page import="com.ldq.imooc.module1.dao.ItemsDao" %>
<%@ page import="com.ldq.imooc.module1.entity.Items" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Module1DemoIndex</title>
    <style type="text/css">
        div {
            float: left;
            margin: 10px;
        }

        div dd {
            margin: 0px;
            font-size: 10pt;
        }

        div dd.dd_name {
            color: blue;
        }

        div dd.dd_city {
            color: #000;
        }
    </style>
</head>

<body>
<h1>商品展示</h1>
<hr>
<center>
    <table width="750" height="60" cellpadding="0" cellspacing="0" border="0">
        <tr>
            <td>
                <!-- 商品循环开始 -->
                <%
                    ItemsDao itemsDao = new ItemsDao();
                    ArrayList<Items> itemsArrayList = itemsDao.getAllItems();
                    if (itemsArrayList != null && itemsArrayList.size() > 0) {
                        for (int i = 0; i < itemsArrayList.size(); i++) {
                            Items item = itemsArrayList.get(i);
                %>
                <div>
                    <dl>
                        <dt>
                            <a href="details.jsp?id="<%=item.getId()%>><img src="images/<%=item.getPicture()%>"
                                                                            width="120" height="90" border="1"/></a>
                        </dt>
                        <dd class="dd_name">
                            <%=item.getName()%>
                        </dd>
                        <dd class="dd_city">产地:<%=item.getCity()%>&nbsp;&nbsp;价格:￥<%=item.getPrice()%>
                        </dd>
                    </dl>
                </div>
                <!-- 商品循环结束 -->
                <%
                        }
                    }
                %>
            </td>
        </tr>
    </table>
</center>
</body>
</html>
