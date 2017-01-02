<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/bootstrap.css">
<link rel="stylesheet" href="resources/css/app.css">
</head>
<body>
	<%@include file="header.jsp"%>
	<div class="container">
		<table class="table">
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Price</th>
			</tr>

			<c:forEach items="${products}" var="prod">
				<tr>
					<td>${prod.id}</td>
					<td>${prod.name}</td>
					<td>${prod.price}</td>
					<td><a href="<c:url value="/edit/{prod.id}"/>">Edit</a></td>
					<td><a href="<c:url value="/delete/{prod.id}"/>">Delete</a></td>
				</tr>


			</c:forEach>

		</table>
	</div>



	<%@include file="footer.jsp"%>



</body>
</html>