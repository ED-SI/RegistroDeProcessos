<%--
  Created by IntelliJ IDEA.
  User: Edmilton
  Date: 02/08/2021
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>New/Edit Processo</title>
</head>
<body>
<div align="center">
    <h1>New/Edit Processo</h1>
    <form:form action="saveProcesso" method="post" modelAttribute="processo">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Name:</td>
                <td><form:input path="numero" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="data" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="valor do recurso" /></td>
            </tr>
            <tr>
                <td>Telephone:</td>
                <td><form:input path="objetivo" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>
