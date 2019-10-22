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
</head>
<body>
<h1> Pick a color: </h1>
<form action="/bg-color-pick.jsp" method="post">

    <label for="colorPick">Enter your favorite color:</label>
    <input id="colorPick" type="text" name="colorPick" placeholder="Enter color">
    <br />
    <input type="submit" />
</form>

</body>
</html>
