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
<c:if test="${user!=null}">
<h1>Name:${user.getName() }</h1>
<h1>Id:${user.getId() }</h1>
<h1>Age:${user.getAge() }</h1>
<h1>Phone:${user.getPhone() }</h1>
<h1>Gender:${user.getGender() }</h1>
 </c:if>
</body>
</html>