<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
	<div class="container mt-5">
	<h1> Skills</h1>
	
	<ul>
		<c:forEach var="skill" items="${skills }">
			<li> Skill : ${skill.skillName} | Level: ${skill.level}</li>
		</c:forEach>
	</ul>
	
	<table class="table">
		<thead>
			<tr>
				<td> Skill </td>
				<td> Level </td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var ="skill" items="${skills }">
				<tr>
					<td>${skill.skillName }</td>
					<td>${skill.level }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	
	</div>
</body>
</html>