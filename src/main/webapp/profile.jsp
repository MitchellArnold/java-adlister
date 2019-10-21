<%--
  Created by IntelliJ IDEA.
  User: mitchellarnold
  Date: 2019-10-21
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Profile</title>

    <style>
        body {
            background: darkgrey;
        }
    </style>
</head>
<body>

<p>Username: <%= request.getParameter("displayName") %></p>
<p>Password: <%= request.getParameter("displayPassword") %></p>

</body>
</html>
