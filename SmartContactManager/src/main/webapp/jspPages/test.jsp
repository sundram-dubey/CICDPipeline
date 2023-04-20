<%@page import="com.hcl.webapps.helper.Message"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<%!Message msg = null;%>
			            <% msg = (Message)request.getAttribute("message"); %>
						<c:if test="${msg!=null}">
							<div class="alert alert-primary" role="alert">A simple
								primary alert—check it out!</div>
						</c:if>
						<%=msg %>
</body>
</html>