<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2px">
<th> ID </th>
<th> Name </th>
<th> Age </th>
<th> Gender </th>
<th> Phone </th>
	<c:forEach var="user" items="${users}">
	<tr> 
<td> ${user.getId() }</td>
<td> ${user.getName() }</td>
<td> ${user.getAge() }</td>
<td> ${user.getGender() }</td>
<td> ${user.getPhone() }</td>
</tr>
</c:forEach>
</table>
</body>
</html>