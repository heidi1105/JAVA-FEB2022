<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   <div class="container mt-5">
		<h1>Project Details</h1>
		<ul>
			<li>Project: <c:out value="${project.title}" /></li>
			<li>Description: <c:out value="${project.description}" /></li>
			<li>Due date: 
				<fmt:formatDate value="${project.duedate }" type="date" /></li>
		</ul>
		<form action="/projects/${project.id}" method="post">
			<input type="hidden" name="_method" value="delete"/>
			<button class="btn btn-danger">Delete project</button>
		
		</form>
   
   </div>
</body>
</html>
