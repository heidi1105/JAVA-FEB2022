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
<title>Gifts</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container mt-5">
	<h1> Gift Dashboard</h1>
	<table class="table table-striped">
		<thead>
			<tr>
				<td>Gift ID</td>
				<td>Gift </td>
				<td>Quantity </td>
				<td>Sender </td>
				<td> Receiver </td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="oneGift" items="${gifts }">
				<tr>
					<td>${oneGift.id }</td>
					<td>${oneGift.giftName }</td>
					<td>${oneGift.quantity } </td>
					<td><a href="/users/${oneGift.sender.id}">
						${oneGift.sender.username }</a></td>
					<td><a href="/users/${oneGift.receiver.id}">
						${oneGift.receiver.username }</a></td>
				</tr>
			</c:forEach>
		</tbody>	
	
	</table>
</div>

</body>
</html>

