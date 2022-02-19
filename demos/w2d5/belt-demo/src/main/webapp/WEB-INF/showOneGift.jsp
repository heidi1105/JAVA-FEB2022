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
</head>
<body>
	<div class="container mt-5">
		<a href="/logout"> Logout</a>
		<h1>Gift Details</h1>
		<ul>
			<li>Gift: <c:out value="${gift.giftName }" /> </li>
			<li>Quantity: ${gift.quantity }</li>
			<li> Sender: ${gift.sender.userName } </li>
			<li> Receiver: ${gift.receiver.userName } </li>
		</ul>



	</div>
</body>
</html>
