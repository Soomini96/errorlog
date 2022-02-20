<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/post/feed" method="post">
        <input type="text" value="${log.id}" name="id">
        <%-- <input type="file" >--%>
        <input type="text" placeholder="파일" name="imagefile">
        <input type="text" placeholder="내용을 입력하세요" name="content">
        <input type="submit" value="작성하기">
    </form>
</body>
</html>
