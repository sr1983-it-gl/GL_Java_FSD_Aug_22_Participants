<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<body>
	<h1>HTTP Status 403 - Access is denied</h1>
	<h2>${msg}</h2>
	
    <hr>
    
	<c:url var="listUrl" value= "/books/list"/>

    <a href="${listUrl}">Back to listing books...</a>    
	
</body>
</html>