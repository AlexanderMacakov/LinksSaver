<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Регистрация</title>
</head>
<body>
<form:form method="POST" action="/add" modelAttribute="user">
    <table>
        <tr>
            <td>Login:</td>
            <td><form:input path="login" /></td>
        </tr>
        <tr>
            <td>firstName</td>
            <td><form:input path="firstName" /></td>
        </tr>
        <tr>
            <td>lastName:</td>
            <td><form:input path="lastName" /></td>
        </tr>
        <tr>
            <td>eMail:</td>
            <td><form:input path="EMail" /></td>
        </tr>
        <tr>
            <td>password:</td>
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
