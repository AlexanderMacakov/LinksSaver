<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Регистрация</title>
</head>
<body>
<form:form method="POST" action="/add" modelAttribute="user">
    <form:hidden path="" />
    <table>
        <tr>
            <td>Login:</td>
            <td><form:input path="login" /></td>
        </tr>
        <tr>
            <td>password</td>
            <td><form:input path="password" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" />
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
