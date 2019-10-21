<%@ page import="model.Contact" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="model.User" %><%--
  Created by IntelliJ IDEA.
  User: mitchellarnold
  Date: 2019-10-21
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>

<%
   List<Contact> contacts = Arrays.asList(
           new Contact("Bobby Jones","2442222444"),
           new Contact("Sally Shortend", "3444443333")
   );

   request.setAttribute("contacts", contacts);
   request.setAttribute("loggedInUser", new User("Bob Smith"));
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Contacts</title>

    <style>
        div {
            background: darkgrey;
            color: white;
            margin: 1em 0;
            padding: 1em;
            border-radius: .2em;
        }
    </style>
</head>
<body>
<c:forEach var="contact" items="${contacts}">
    <div>
        <h3>${contact.name}</h3>
        <h3>Phone number: ${contact.number}</h3>
        <c:if test="${contact.name.equalsIgnoreCase(loggedInUser)}">
            <a href="">Edit Contact</a>
        </c:if>
    </div>
</c:forEach>





</body>
</html>
