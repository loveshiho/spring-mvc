<%--
  Created by IntelliJ IDEA.
  User: zhong
  Date: 2024/4/23
  Time: 00:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="getDataByPojo">
        <input type="text" name="uname">
        <input type="text" name="uage">
        <br>
        <input type="checkbox" name="uhobby" value="1"> 篮球
        <input type="checkbox" name="uhobby" value="2"> 足球
        <input type="checkbox" name="uhobby" value="3"> 排球
        <br>
        <input type="text" name="birthday">
        <input type="submit">
    </form>
    <form action="getDataByDate">
        <input type="text" name="birthday">
        <input type="submit">
    </form>
</body>
</html>
