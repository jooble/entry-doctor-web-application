<?xml version="1.0" encoding="UTF-8"?>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!doctype html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Login</title>
    <link href="<c:url value="/pages/css/bootstrap.min.css" />" rel="stylesheet">
</head>

<body>

<div class="container" style="width: 300px;">
    <c:url value="/j_spring_security_check" var="loginUrl"/>
    <form action="${loginUrl}" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" class="form-control" name="j_username" placeholder="login" required autofocus
               value="user1">
        <input type="password" class="form-control" name="j_password" placeholder="Password" value="1234" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
    </form>
    <c:if test="${param.error == 'true'}">
        <span>Incorrect login or password</span>
    </c:if>
</div>
</body>
</html>