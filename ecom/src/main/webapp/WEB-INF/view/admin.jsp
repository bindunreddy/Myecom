<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:url value="/resources/images/productimages/" var="images" />
<c:set var="cp" value="${pageContext.request.contextPath}" />




<%@include file="header.jsp"%>


<!-- Adding container for the Label Itself -->
<div class="container">

	<div class="row vertical-center-row">
		<div class="text-center col-md-4 col-md-offset-4"
			style="background: white"></div>
	</div>
</div>
<br>


<form:form action="product.do" method="POST" modelAttribute="product"
	enctype="multipart/form-data">
	<div class="mainbox col-md-8 col-md-offset-3 col-sm-8 col-sm-offset-2">
		<div class="panel panel-info">
			<div class="panel-heading">
				<div class="panel-title">Admin Product Form</div>
			</div>
		</div>
		<table class="table">

			<tr>
				<td>Product Name</td>
				<td><form:input path="name" cssClass="form-control" /> <form:hidden
						path="id" /></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Product Brand</td>
				<td><form:input path="brand" cssClass="form-control" /></td>
			</tr>
			<tr>
				<td>Product Price</td>
				<td><form:input path="price" cssClass="form-control" /></td>
			</tr>
			<tr>
				<td><form:input path="file" type="file" /></td>

			</tr>


			<tr>
				<td class="col-sm-8 controls"><input type="submit"
					class="btn btn-success" value="Submit" /></td>
			</tr>

		</table>
	</div>




</form:form>

<div class="mainbox col-md-8 col-md-offset-3 col-sm-8 col-sm-offset-2">

	<table class="table">
		<tr>
			<th>Id</th>
			<th>Product Name</th>
			<th>Product Brand</th>
			<th>Product Price</th>
			<th>Product Image</th>


		</tr>
		<c:forEach items="${products}" var="product">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.brand}</td>
				<td>${product.price}</td>
				<td>${product.file}</td>
				<!-- later added -->
				<%-- <td><img src="${images}/${product.id}.jpg" height="100px"
					width="100px" /></td> --%>
				<td><a href="${cp}/adminform/edit/${product.id}"
					class="btn btn-sm btn-primary">Edit</a><a
					href="${cp}/adminform/delete/${product.id}"
					class="btn btn-sm btn-primary">Delete</a>
			</tr>


		</c:forEach>

	</table>
</div>



</body>
</html>