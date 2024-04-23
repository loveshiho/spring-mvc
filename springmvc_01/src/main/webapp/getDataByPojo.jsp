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
        <br>
        宠物:
        <p>
            宠物1: 名字:<input type="text" name="pets[0].pname" >类型:<input type="text" name="pets[0].ptype">
        </p>
        <p>
            宠物2: 名字:<input type="text" name="pets[1].pname" >类型:<input type="text" name="pets[1].ptype">
        </p>
        <input type="submit">
    </form>
    <form action="getDataByDate">
        <input type="text" name="birthday">
        <input type="submit">
    </form>
</body>
</html>
