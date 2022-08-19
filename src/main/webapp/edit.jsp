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
<form:form modelAttribute="user" action="edit">
<form:label path="id">ID</form:label>
<form:input path="id"/>
<form:label path="age">Age</form:label>
<form:input path="age"/>
<form:label path="name">Name</form:label>
<form:input path="name"/>
<form:label path="gender">Gender</form:label>
<form:input path="gender"/>
<form:label path="phone">Phone</form:label>
<form:input path="phone"/>
<form:button>update</form:button>
</form:form>
</body>
</html>