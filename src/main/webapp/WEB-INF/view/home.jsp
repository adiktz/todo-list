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
    <title>Todo List Application</title>
</head>
<body>

    <div align="center">
        <c:url var="itemsLink" value="${Mappings.ITEMS}"/>
        <h2><a href="${itemsLink}">Show Todo Items</a> </h2>
    </div>

</body>
</html>
