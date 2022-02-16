<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="member" items="${memberList}">
    <c:out value="${member.id}"/>
    <c:out value="${member.name}"/>
</c:forEach>

</body>
</html>
