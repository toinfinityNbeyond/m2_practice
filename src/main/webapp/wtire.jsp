<%--
  Created by IntelliJ IDEA.
  User: 82102
  Date: 2021-08-13
  Time: 오후 5:44
  To change this template use File | Settings | File Templates.
--%>
<%
    Object obj = session.getAttribute("member");

    if (obj == null) {
        response.sendRedirect("/login?result=fail");
        return;
    }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Write Page</h1>
<form action="WEB-INF/login.jsp" method="post">
    <button type="submit">WRITE</button>
</form>
</body>
</html>
