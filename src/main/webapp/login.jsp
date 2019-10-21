<%--
  Created by IntelliJ IDEA.
  User: mitchellarnold
  Date: 2019-10-21
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    if(request.getParameter("displayName") != null && request.getParameter("displayPassword") != null){
        if(request.getParameter("displayName").equals("admin") && request.getParameter("displayPassword").equals("password")){
            response.sendRedirect("/profile.jsp");
        }else{
            response.sendRedirect("/login.jsp");
        }
    }



%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/login.jsp" method="post">

    <label for="displayName">Username:</label>
    <input id="displayName" type="text" name="displayName" placeholder="Enter name">
    <br />
    <label for="displayPassword">Password:</label>
    <input id="displayPassword" type="text" name="displayPassword" placeholder="Enter password">
    <br />
    <input type="submit" />
</form>








<%--<c:choose>--%>
<%--    <c:when test="${}">--%>
<%--        <% response.setAttribute(); %>--%>
<%--    </c:when>--%>
<%--    <c:when test="${password}">--%>
<%--        <p>boolean_expression_1 was false, and boolean_expression_2 was true</p>--%>
<%--    </c:when>--%>
<%--    <c:otherwise>--%>
<%--&lt;%&ndash;        response.&ndash;%&gt;--%>
<%--    </c:otherwise>--%>
<%--</c:choose>--%>




</body>
</html>
