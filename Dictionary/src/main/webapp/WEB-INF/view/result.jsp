<%--
  Created by IntelliJ IDEA.
  User: tranchung
  Date: 20/04/2019
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>Result :</h1>
        <c:if test="${message != null}">
        <p><c:out value="${message}"/></p>
        </c:if>
        <p><c:out value="${result}"/></p>
</body>
</html>
