<%@page import="com.hcl.webapps.helper.Message"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">

<title>home</title>
</head>
<body>
	<%@ include file="base01.jsp"%>
	<section>
		<div class="container ">
			<div class="row">
				<div class="col-md-6 offset-md-3">
					<div class="my-card mt-1">
			            <% 
			            Message msg = (Message)request.getAttribute("message");
			            %>
			            <%=msg!=null %>
						<c:if test="${msg!=null}" >
							<div class="alert alert-primary" role="alert">A simple
								primary alert, check it out!</div>
						</c:if>
						<div class="container text-center">
							<img style="width: 100px" alt="" src="/imagesfile/scmbg2.png">
						</div>
						<h1 class="text-center">Register Here</h1>
						<form action="/do_register" method="post">
							<div class="form-group">
								<label for="name_field">Name </label> <input type="text"
									class="form-control" id="name_field"
									aria-describedby="emailHelp" placeholder="start from here"
									name="name"> <small id="emailHelp"
									class="form-text text-muted">We'll never share your
									email with anyone else.</small>
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="email"> <small
									id="emailHelp" class="form-text text-muted">We'll never
									share your email with anyone else.</small>
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" class="form-control" id="exampleInputPassword1"
									name="password">
							</div>

							<!-- about user field -->
							<div class="form-group">
								<textarea name="about" rows="10" cols=""
									placeholder="brief about yourself" class="form-control"></textarea>
							</div>
							<div class="form-group form-check">
								<input type="checkbox" class="form-check-input"
									id="exampleCheck1" name="agreement"> <label
									class="form-check-label" for="exampleCheck1">accept
									term & condition</label>
							</div>
							<!-- t&c agreement -->
							<div class="container">
								<button type="submit" class="btn btn-primary"
									class="btn bg-primary text-white">Submit</button>
								<button type="reset" class="btn btn-warning">Reset</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>