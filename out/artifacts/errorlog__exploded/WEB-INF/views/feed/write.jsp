<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/feed/write" method="post">
        <input type="text" value="${log.id}">
        <input type="file" >
        <input type="text" placeholder="내용을 입력하세요">
        <input type="submit" value="작성하기">
    </form>
</body>
</html>
