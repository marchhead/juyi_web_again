<%--
  Created by IntelliJ IDEA.
  User: juyibai
  Date: 2/26/20
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>
<form action="LoginServlet" method="post">
    <table>
        <thead>
        <tr>
            <th colspan="2">The table header</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>USERNAME:</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>PASSWORD:</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <input type="submit" value="LOGIN"/>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
