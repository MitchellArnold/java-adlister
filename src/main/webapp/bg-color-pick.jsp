<%--
  Created by IntelliJ IDEA.
  User: mitchellarnold
  Date: 2019-10-22
  Time: 09:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <style>
        body{
            background: <%= request.getParameter("colorPick") %>;
        }

    </style>
</head>
<body>
<h1> Welcome to your favorite color!</h1>
<p>Good choice on <%= request.getParameter("colorPick") %>!</p>

</body>
</html>
