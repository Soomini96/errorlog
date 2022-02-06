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
  여기는 index 입니다.

  <form action="goLogin" method="post">
    ID: <input type="text" name="id" placeholder="아이디를 입력하세요."><br>
    PW: <input type="text" name="pw" placeholder="비밀번호를 입력하세요.">
    <input type="submit" value="로그인">
  </form>

<%--  --%>
  <a href="goJoin">처음이신가요?<button>회원가입</button></a><br>
  <button onclick="location.href='goMain'">메인으로</button>

<%--  <form class="usrLoginForm" name="usrLoginForm" id="usrLoginForm" action="loginProM" method="post">&ndash;%&gt;--%>
    <%--    <label class="form-label-outside">아이디</label>--%>
    <%--    <input class="form-input form-control-has-validation form-control-last-child" type="text" id="id" name="id" placeholder="영문(대소문자) 또는 숫자 4~12자리 조합">--%>
    <%--    <span id="idCheck"></span>--%>
    <%--    <br>--%>

    <%--    <label class="form-label-outside">비밀번호</label>--%>
    <%--    <input class="form-input form-control-has-validation form-control-last-child" type="password" id="pw" name="pw" placeholder="영문(대소문자) 또는 숫자 4~12자리 조합">--%>
    <%--    <span id="pwCheck"></span>--%>
    <%--    <br >--%>


    <%--    <input type="submit" value="sign in" id="btn">--%>
<%--  </form> --%>
  <script src="static/js/log.js"></script>
  </body>
</html>
