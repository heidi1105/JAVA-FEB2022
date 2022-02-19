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
</head>
<body>
   <div class="container mt-5">
	<a href="/logout"> Logout</a>
	<a href="/gifts/new" class="btn btn-success"> Send a gift</a>
<h1> Gift Dashboard</h1>
	<table class="table table-striped">
		<thead>
			<tr>
				<td>Gift ID</td>
				<td>Gift </td>
				<td>Quantity </td>
				<td>Sender </td>
				<td> Receiver </td>
				<td colspan="2"> Actions </td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="oneGift" items="${gifts }">
				<tr>
					<td>${oneGift.id }</td>
					<td><a href="/gifts/${oneGift.id}"><c:out value="${oneGift.giftName }" /></a></td>
					<td>${oneGift.quantity } </td>
					<td>${oneGift.sender.userName }</td>
					<td>${oneGift.receiver.userName }</td>
					<td><a href="/gifts/edit/${oneGift.id }" class="btn btn-success">Edit</a></td>
					<td>
					<form action="/gifts/${oneGift.id}" method="POST">
					<input type="hidden" name="_method" value="delete" />
					<button class="btn btn-danger">Delete</button>
					
					</form>
					
					
					
					</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>

	
   
   </div>
</body>
</html>
