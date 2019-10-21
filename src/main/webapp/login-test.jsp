<%--
  Created by IntelliJ IDEA.
  User: mitchellarnold
  Date: 2019-10-21
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login-Test</title>
</head>
<body>

<form action="/display-name.jsp" method="post">
    Username:
    <label for="displayName">Enter Name</label>
    <input id="displayName" type="text" name="displayName" placeholder="Enter name">
    <br />
    Description:
    <input name="description" />
    <br />
    <input type="submit" />
</form>

</body>
</html>
