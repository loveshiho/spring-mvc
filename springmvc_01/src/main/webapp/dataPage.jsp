<%--
  Created by IntelliJ IDEA.
  User: zhong
  Date: 2024/4/22
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="getParamByReq">
        <input type="text" name="username">
        <input type="text" name="pwd">
        <input type="submit" value="getParamByReq">
    </form>
    <form action="getParamNoReq">
        <input type="text" name="username">
        <input type="text" name="pwd">
        <input type="submit" value="getParamNoReq">
    </form>
</body>
</html>
