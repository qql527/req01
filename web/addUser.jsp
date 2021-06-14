<%--
  Created by IntelliJ IDEA.
  User: qql
  Date: 2021/6/10
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
</head>
<body>
        <form action="${pageContext.request.contextPath}/addUser.do" method="post">

            用户名:<input name="userName" value="${user.userName}" onchange="checkUserName(this.value)">
            <font id="userNameErr"></font>
            地址:<input name="address" value="${user.address}">
            密码:<input type="password" name="pwd" value="${user.pwd}">

            性别:<input type="radio" name="sex" value="1" <c:if test="${user.sex==1}">checked</c:if>>男
            <input type="radio" name="sex" value="2" <c:if test="${user.sex==2}">checked</c:if>>女
            <input type="radio" name="sex" value="0" <c:if test="${user.sex==0}">checked</c:if>>未知
            <input type="submit" value="提交">
        </form>
</body>
</html>
