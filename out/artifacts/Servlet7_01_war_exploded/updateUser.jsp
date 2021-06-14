<%--
  Created by IntelliJ IDEA.
  User: qql
  Date: 2021/6/10
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        jsp建议什么都不要写，看能不能进来
        进来了再去写代码c
        <form action="${pageContext.request.contextPath}/updateUser.do" method="post">
            请所有同学注意，一定要加id
            id值为: ${user.id}  用户名为:${user.userName}
            <br>
            <input name="id" value="${user.id}" type="hidden">
            用户名:<input name="userName" value="${user.userName}">
            地址:<input name="address" value="${user.address}">

            性别:<input type="radio" name="sex" value="1" <c:if test="${user.sex==1}">checked</c:if>>男
            <input type="radio" name="sex" value="2" <c:if test="${user.sex==2}">checked</c:if>>女
            <input type="radio" name="sex" value="0" <c:if test="${user.sex==0}">checked</c:if>>未知
            <input type="submit" value="提交">
        </form>
</body>
</html>
