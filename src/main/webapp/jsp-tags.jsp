<%--
  Created by IntelliJ IDEA.
  User: mitchellarnold
  Date: 2019-10-21
  Time: 09:23
  To change this template use File | Settings | File Templates.
--%>

<%--JSP Directive--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    int x = 3;
    x += 2;
    String bob = "hello";
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html>
<head>
    <title>Implicit Object Example</title>
</head>
<body>
<h1>Welcome To The Landing!</h1>
<p>Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<p>Username: <%= request.getParameter("displayName") %></p>
<p>Description: <%= request.getParameter("description")%></p>
<p>User-Agent header: <%= request.getHeader("user-agent") %></p>

<%--============ Source Loads ========--%>
<jsp:include page="login-test.jsp"></jsp:include>

</body>
</html>



</body>
</html>
