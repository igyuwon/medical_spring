<%--
  Created by IntelliJ IDEA.
  User: igyuwon
  Date: 24. 7. 8.
  Time: 오후 4:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>

<html>
    <head>
        <title>doMember</title>
    </head>
    <style>
        table,th,td{border:1px solid black; border-collapse: collapse;}
        th,td{width: 200px;}
    </style>
    <body>
        <h2>member에서 넘어온 로그인 정보</h2>
        <form action="memUpdate", method="post">
        <input type="hidden" name="id" value="${id}">
        <input type="hidden" name="pw" value="${pw}">
        <input type="hidden" name="name" value="${name}">
        <input type="hidden" name="phone" value="${phone}">
        <input type="hidden" name="gender" value="${gender}">
        <input type="hidden" name="hobby" value="${hobby}">
        <table>
            <tr>
                <th>데이터</th>
                <th>값</th>
            </tr>
            <tr>
                <td>아이디</td>
                <td>${id}</td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td>${pw}</td>
            </tr>
            <tr>
                <td>이름</td>
                <td>${name}</td>
            </tr>
            <tr>
                <td>전화번호</td>
                <td>${phone}</td>
            </tr>
            <tr>
                <td>성별</td>
                <td>${gender}</td>
            </tr>
            <tr>
                <td>취미</td>
                <td>${hobby}</td>
            </tr>
        </table>
        <input type="submit",values="수정"></input>
        </form>
    </body>
</html>
