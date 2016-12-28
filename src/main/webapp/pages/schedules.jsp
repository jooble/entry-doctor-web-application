<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="javatime" uri="http://sargue.net/jsptags/time" %>
<?xml version="1.0" encoding="UTF-8" ?>
<html>
<head>
    <title>Schedule</title>
    <meta charset="utf-8">
    <link href="<c:url value="/pages/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body>
<div class="container">
    <jsp:include page="/pages/header.jsp"/>
    <h1 class="text-center">Schedule</h1>
    <div id="table-doctors">
        <table class="table">
            <tr>
                <th>Doctor</th>
                <th>Day</th>
                <th>Period</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="schedule" items="${schedules}">
                <tr>
                    <td>${schedule.doctor.firstName} ${schedule.doctor.lastName}</td>
                    <td><javatime:format value="${schedule.day}" pattern="dd.MM"/></td>
                    <td><javatime:format value="${schedule.periodStart}" pattern="HH:mm"/> - <javatime:format
                            value="${schedule.periodEnd}" pattern="HH:mm"/></td>
                    <td>
                        <a class="btn btn-default btn-xs" href="/schedule/${schedule.id}/entry"
                           role="button">entry</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>