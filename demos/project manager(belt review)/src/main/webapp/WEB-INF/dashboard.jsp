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
   <p><a href ="/logout"> Logout</a></p>
   <p><a href="/projects/new"> Create new project</a></p>
   
   <h1> All Projects</h1>
   		<table class="table table-striped">
   			<thead>
   				<tr>
   					<td> ID </td>
   					<td> Project </td>
   					<td> Team Lead </td>
   					<td> Due Date </td>
   					<td colspan="2"> Actions </td>
   				</tr>
   			</thead>
   			<tbody>
   				<c:forEach var="project" items="${projects }">
   					<tr>
   						<td>${project.id}</td>
   						<td><a href="/projects/${project.id }"><c:out value="${project.title }" /></a></td>
   						<td><c:out value="${project.creator.userName }" /></td>
   						<td>
   						<fmt:formatDate value="${project.duedate }" type="date"/>
   						
   						</td>
   						<td>Join Team</td>
   						<td>
   						<a href="/projects/edit/${project.id }">Edit</a>
   						
   						</td>
   					</tr>
   				</c:forEach>
   			</tbody>
   		</table>
   		
   		
   		 <h1> Your Projects</h1>
   		<table class="table table-striped">
   			<thead>
   				<tr>
   					<td> ID </td>
   					<td> Project </td>
   					<td> Team Lead </td>
   					<td> Due Date </td>
   					<td colspan="2"> Actions </td>
   				</tr>
   			</thead>
   			<tbody>
   				<c:forEach var="project" items="${user.createdProjects }">
   					<tr>
   						<td>${project.id}</td>
   						<td><a href="/projects/${project.id }"><c:out value="${project.title }" /></a></td>
   						<td><c:out value="${project.creator.userName }" /></td>
   						<td>
   						<fmt:formatDate value="${project.duedate }" type="date"/>
   						
   						</td>
   						<td>Join Team</td>
   						   						<td>
   						<a href="/projects/edit/${project.id }">Edit</a>
   						
   						</td>
   					</tr>
   				</c:forEach>
   			</tbody>
   		</table>
   
   </div>
</body>
</html>
