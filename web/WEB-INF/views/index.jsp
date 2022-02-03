<%--
  Created by IntelliJ IDEA.
  User: leesoomin
  Date: 2022/02/03
  Time: 1:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>
  ```
  여기는 index 입니다.
  ```
  <form class="login" method="get">
    ID: <input type="text" placeholder="아이디를 입력하세요."><br>
    PW: <input type="text" placeholder="비밀번호를 입력하세요.">
    <button type="submit" onclick="login(form)">로그인</button>
  </form>
  <a href="goMain">처음이신가요?<button>회원가입</button></a>


  <script src="js/log.js"></script>
  </body>
</html>
