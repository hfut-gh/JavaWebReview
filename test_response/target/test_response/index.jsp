<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        Login page
    </title>
</head>
<body>
<h2>登录表</h2>
<%
    out.println(pageContext.getServletContext().getContextPath());
%>
<form action="${pageContext.request.contextPath}/redirect"  method="get" >
用户名:<input type="text" name="username"> <br>
    密码:<input type="text" name="password"> <br>
    <input type="submit">
</form>

<a href="${pageContext.request.contextPath}/dispatch">click here to dispatch!</a>

</body>
</html>
