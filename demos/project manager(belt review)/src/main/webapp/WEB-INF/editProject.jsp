<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

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
		<form:form action="/projects/edit/${project.id }" method="post" modelAttribute="project" class="form-control">
			<input type="hidden" name="_method" value="put" />
			<form:hidden path="creator" value="${project.creator.id}" />
			<div>
				<form:label path="title" class="form-label">Project Title</form:label>
				<form:input path="title" type="text" class="form-control" />
				<form:errors path="title" class="text-danger" />
			</div>
			<div>
				<form:label path="description" class="form-label">Project Description</form:label>
				<form:input path="description" type="text" class="form-control" />
				<form:errors path="description" class="text-danger" />
			</div>
			<div>
				<form:label path="duedate" class="form-label">Due Date</form:label>
				<form:input path="duedate" type="date" class="form-control" />
				<form:errors path="duedate" class="text-danger" />
			</div>
			<button class="btn btn-primary">Edit</button>

		</form:form>

	</div>
</body>
</html>
