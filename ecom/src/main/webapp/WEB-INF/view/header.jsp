<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<c:set value="${pageContext.request.contextPath}" var="cp" />
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="icon" href="../../favicon.ico">

<title>HOME</title>

<!-- <!-- Bootstrap core CSS
<link href="resources/css/bootstrap.css" rel="stylesheet">
<link href="resources/css/app.css" rel="stylesheet">
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.js"></script>
 --> 



<c:set var="bt" value="/resources/css">
</c:set>
<link rel="stylesheet" href="<c:url value="${bt}/bootstrap.css"/>" />
<link rel="stylesheet" href="<c:url value="${bt}/app.css"/>" />
<link rel="stylesheet" href="<c:url value="${bt}/bootstrap.min.css"/>">


<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.js"></script>

</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="">Aryan Books World</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="<c:url value="/index"/>">Home</a></li>
					<li><a href="<c:url value="/about"/>">About</a></li>
					<li><a href="<c:url value="/contact"/>">Contact</a></li>


				</ul>
				<ul class="nav navbar-nav navbar-right">
				<%-- 	<li><a href="<c:url value="/login"/>"><span
							class="glyphicon glyphicon-log-in"></span> Login</a></li> --%>
					<%-- <li><a href="<c:url value="/admin/adminform"/>">Admin</a></li> --%>

					<sec:authorize access="hasRole('ROLE_ADMIN')" var="isAdmin">

						<li><a href="<c:url value="/admin/adminform"/>">Admin</a></li>


					</sec:authorize>
					<sec:authorize access="hasRole('ROLE_USER')" var="isUser">

					</sec:authorize>

					<c:if test="${(isAdmin)  || (isUser)}">

						<li><a href="<c:url value="/logout"/>">LogOut</a></li>
					</c:if>

				<%-- 	<li><a href="<c:url value="/register"/>">Register</a></li> --%>

					<c:choose>
						<c:when test="${(isAdmin)  || (isUser)}">

						</c:when>
						<c:otherwise>

							<li><a href="<c:url value="/getregisterform"/>"><span
									class="glyphicon glyphicon-user"></span>Register </a></li>
							<li><a href="<c:url value="/login"/>"><span
									class="glyphicon glyphicon-log-in"></span>Login</a></li>

						</c:otherwise>
					</c:choose>
				</ul>

			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>




</body>



</html>


