<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="cp" value="${pageContext.request.contextPath}" />
<%@ include file="header.jsp"%>

<div class="container">
	<!-- container start -->
	<div class="row">
		<!-- row Start -->

		<div class="col-lg-3">
			<!-- empty column for space from right -->
		</div>
		<div class="col-lg-6">
			<!-- col Start -->
			<article role="login">
				<h3 class="text-center">
					<i class="fa fa-lock"></i>Sign Up
				</h3>

				<form:form method="POST" action="insert" modelAttribute="user">

					<div class="form-group">
						<form:hidden path="uid" />
					</div>

					<div class="form-group">
						<form:input path="name" class="form-control"
							placeholder="User Name" required="required" />
						<form:errors path="name" style="color:red;" />
					</div>
					<div class="form-group">
						<form:input path="email" type="email" class="form-control"
							placeholder="User email" required="required" />
						<form:errors path="email" style="color:red;" />
					</div>
					<div class="form-group">
						<form:input path="password" type="password" class="form-control"
							placeholder="User Password" required="required" />
						<form:errors path="password" style="color:red;" />
					</div>
					<%-- 	<div class="form-group">
						<form:input path="address" type="textarea" class="form-control"
							placeholder="Address" required="required" />
						<form:errors path="address" style="color:red;" />
					</div>
 --%>
					<div class="form-group">
						<form:hidden path="enabled" value="true" />
						<form:errors path="enabled" style="color:red;" />
					</div>

					<div class="form-group">
						<form:hidden path="role" value="ROLE_USER" />
						<form:errors path="role" style="color:red;" />
					</div>


					<div class="form-group">
						<div class="checkbox">
							<label> <input type="checkbox"> Please accept the
								terms and conditions to proceed with your request.
							</label>
						</div>
					</div>
					<div class="form-group" align="center">
						<button type="submit" class="btn btn-primary" value="Register">Submit</button>
					</div>

				</form:form>

			</article>
		</div>
		<!-- col over -->

		<div class="col-lg-3">
			<!-- empty column for space from left -->
		</div>

	</div>
	<!-- Row over -->

</div>
<!-- Contain over -->
