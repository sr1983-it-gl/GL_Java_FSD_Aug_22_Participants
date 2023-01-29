<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>Students Directory</title>
</head>

<body>

	<div class="container">

		<h3>Students Directory</h3>
		<hr>       


		<c:url var="addFormUrl" value="/students/showFormForAdd" />
		<!-- Add a button -->
		<a href="${addFormUrl}"
			class="btn btn-primary btn-sm mb-3"> Add Student </a> 
			
		<c:url var="logoutUrl" value="/logout" />
		<a href="${logoutUrl}" 
				class="btn btn-primary btn-sm mb-3 mx-auto"> Logout </a> 
					

		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
                    <th>Id</th>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Course</th>
					<th>Country</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${Students}" var="tempStudent">
					<tr>
                        
                        <td>
                            <c:out value="${tempStudent.id}" />
                        </td>
                        
						<td><c:out value="${tempStudent.firstName}" /></td>
                        
						<td><c:out value="${tempStudent.lastName}" /></td>
						<td><c:out value="${tempStudent.course}" /></td>
						<td><c:out value="${tempStudent.country}" /></td>

						<td>

							<!-- Add "update" button/link --> 
							
							<c:url var="updateUrl" value="/students/showFormForUpdate?studentId=${tempStudent.id}" />
							
							<a
							href="${updateUrl}"

							class="btn btn-info btn-sm"> Update 
							</a> 


							<c:url var="deleteUrl" value="/students/delete?studentId=${tempStudent.id}" />


							<a href="${deleteUrl}"


							class="btn btn-danger btn-sm"


							onclick="if (!(confirm('Are you sure you want to delete this Student?'))) return false">


								Delete 
							</a>
	
	
						</td>	
		
					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>

</body>
</html>