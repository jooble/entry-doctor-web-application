<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!doctype html>
<html lang="en">
<head>
    <title>All Doctors</title>
    <meta charset="utf-8">
    <link href="<c:url value="/pages/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body>
<div class="container">
    <jsp:include page="/pages/header.jsp"/>
    <main>
        <h1 class="text-center">All Doctors</h1>
        <div id="table-doctors">
            <table class="table">
                <tr>
                    <th>Name</th>
                    <th>Last Name</th>
                    <th>Actions</th>
                </tr>
                <c:forEach var="doctor" items="${doctors}">
                    <tr>
                        <td>${doctor.firstName}</td>
                        <td>${doctor.lastName}</td>
                        <td>
                            <a class="btn btn-primary btn-xs" href="/doctor/${doctor.id}/schedules"
                               role="button">schedule</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </main>
</div>
</body>
</html>