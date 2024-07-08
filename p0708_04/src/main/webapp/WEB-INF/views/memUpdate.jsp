<%--
  Created by IntelliJ IDEA.
  User: igyuwon
  Date: 24. 7. 8.
  Time: 오후 4:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<html>
    <head>
        <title>MemUpdate</title>
    </head>
    <body>
        <h2>회원정보수정</h2>
        <form action="doMember" name="login" method="post">
            <label>아이디</label>
            <input type="text" name="id" value="${id}"><br>
            <label>비밀번호</label>
            <input type="text" name="pw" value="${pw}"><br>
            <label>이름</label>
            <input type="text" name="name"><br>
            <label>전화번호</label>
            <input type="text" name="phone"><br>
            <label>성별</label><br>
            <input type="radio" name="gender" value="male" id="male">
            <label for="male">남자</label>
            <input type="radio" name="gender" value="female" id="female">
            <label for="female">여자</label><br>
            <label>취미</label><br>
            <input type="checkbox" name="hobby" value="game" id="game">
            <label for="game">게임</label>
            <input type="checkbox" name="hobby" value="run" id="run">
            <label for="run">조깅</label>
            <input type="checkbox" name="hobby" value="book" id="book">
            <label for="book">독서</label>
            <input type="checkbox" name="hobby" value="golf" id="golf">
            <label for="golf">골프</label>
            <input type="checkbox" name="hobby" value="swim" id="swim">
            <label for="swim">수영</label>
            <br>


            <input type="submit" value="전송">
        </form>
    </body>
</html>
