<%--
  Created by IntelliJ IDEA.
  User: 82102
  Date: 2021-08-13
  Time: 오후 6:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Fake Login</h1>
<%
    String userid = request.getParameter("userid");
    session.setAttribute("name",userid);
%>
<h2><%=userid%>이 로그인 되었음</h2>
</body>
</html>
