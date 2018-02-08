<%--
  Created by IntelliJ IDEA.
  User: lidq
  Date: 2018/1/18
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>Module1DemoIndex</title>

    <style type="text/css">
        div {
            float: left;
            margin-left: 30px;
            margin-right: 30px;
            margin-top: 5px;
            margin-bottom: 5px;
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
<h1>商品详情</h1>
<hr>
<center>
    <table width="750" height="60" cellpadding="0" cellspacing="0" border="0">
        <tr>

            <td width="70%" valign="top">
                <table>
                    <tr>
                        <td rowspan="4"><img src="images/" width="200" height="160"/></td>
                    </tr>
                    <tr>
                        <td><B></B></td>
                    </tr>
                    <tr>
                        <td>产地：</td>
                    </tr>
                    <tr>
                        <td>价格：￥</td>
                    </tr>
                </table>
            </td>

            <td width="30%" bgcolor="#EEE" align="center">
                <br>
                <b>您浏览过的商品</b><br>
                <div>
                    <dl>
                        <dt>
                            <a href="details.jsp?id="><img src="images/" width="120" height="90" border="1"/></a>
                        </dt>
                        <dd class="dd_name"></dd>
                        <dd class="dd_city">产地:&nbsp;&nbsp;价格: ￥</dd>
                    </dl>
                </div>
            </td>

        </tr>
    </table>
</center>
</body>
</html>
