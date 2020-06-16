<%--
  Created by IntelliJ IDEA.
  User: gaurav
  Date: 16/06/20
  Time: 11:24 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="ravi.gaurav.util.Mappings" %>
<html>
<head>
    <title>Todo Items</title>
</head>
<body>

<div align="center">

    <table border="1" cellpadding="5">
        <caption><h2>Todo Item</h2></caption>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Details</th>
            <th>Deadline</th>
        </tr>
        <tr>
            <td><c:out value="${item.id}"/></td>
            <td><c:out value="${item.title}"/></td>
            <td><c:out value="${item.details}"/></td>
            <td><c:out value="${item.deadline}"/></td>
        </tr>
    </table>
    <c:url var="itemsUrl" value="${Mappings.ITEMS}"/>
    <a href="${itemsUrl}"><h1>Back to Items</h1></a>
</div>

</body>
</html>
