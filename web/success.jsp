<%--
  Created by IntelliJ IDEA.
  User: juyibai
  Date: 2/26/20
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>SUCCESS</title>
</head>
<body>
<h1>WELCOME, ${sessionScope.username}</h1> <a href="LogoutServlet">LOGOUT</a>
<form action="AddServlet" method="post">
    <table>
        <thead>
        <tr>
            <th colspan="2">Add Department</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>DEPTNAME:</td>
            <td><input type="text" name="deptname"/></td>
        </tr>
        <tr>
            <td>DEPTADDRESS:</td>
            <td><input type="text" name="deptaddr"/></td>
        </tr>
        <tr>
            <th colspan="2"><input type="submit" value="ADD"/></th>
        </tr>
        </tbody>
    </table>
</form>
<h2>******************DEPARTMENTS******************</h2>
<table>
    <tr>
        <td>DEPARTMENT NAME</td>
        <td>DEPARTMENT ADDRESS</td>
    </tr>
    <c:forEach items="${applicationScope.departments}" var="dept">
        <tr>
            <td>${dept.deptName}</td>
            <td>${dept.deptAddr}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
