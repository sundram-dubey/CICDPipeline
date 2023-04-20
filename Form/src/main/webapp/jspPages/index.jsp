<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head >
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
 integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<style>
.component {
  color: var(--bs-gray-800);
  background-color: var(--bs-gray-100);
  border: 1px solid var(--bs-gray-200);
  border-radius: .25rem;
}

.component-header {
  color: var(--bs-purple);
}

body {
  --bs-body-font-family: var(--bs-font-monospace);
  --bs-body-line-height: 1.4;
  --bs-body-bg: var(--bs-gray-100);
}

.table {
  --bs-table-color: var(--bs-gray-600);
  --bs-table-bg: var(--bs-gray-100);
  --bs-table-border-color: transparent;
}
</style>
</head>
<body>
<h1 style='text-align:center'>Register here</h1>
  <div class="container">
  	<div class="row mt-5" >
  		<div class="col-md-6 offset-md-3">
  		<form action="processurl" method="post" >
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">iD</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name = "ciD">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Course</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name = "cName">
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name ="cMail">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
  		</div>
  	</div>
  </div>
</body>
</html>