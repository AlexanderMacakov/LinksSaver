<%--
  Created by IntelliJ IDEA.
  User: Reklama
  Date: 25.07.2018
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Все Пользователи</title>
</head>
<body>
<table width="600px">
    <tr>
        <td><b>Login</b></td>
        <td><b>Firstname</b></td>
        <td><b>Lastname</b></td>
        <td><b>E-mail</b></td>
        <td><b>password</b></td>
        <td><b>Action</b></td>

    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.login}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.eMail}</td>
            <td>${user.password}</td>
            <td><a href="/edit?id=${user.login}">Edit</a> | <a href="/delete?id=${user.login}">Delete</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="5">
            <a href="/add">Добавить запись</a>
        </td>
    </tr>
</table>
</body>
</html>
