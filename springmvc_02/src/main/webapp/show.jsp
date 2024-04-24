<%--
  Created by IntelliJ IDEA.
  User: zhong
  Date: 2024/4/24
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    req:msg:${requestScope.msg},users:${requestScope.users}<br>
    session:msg:${sessionScope.msg},users:${sessionScope.users}<br>
    application:msg:${applicationScope.msg},users:${applicationScope.users}<br>
</body>
</html>
