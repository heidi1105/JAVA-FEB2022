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
		<h1>Send a gift</h1>
		<form:form action="/gifts/new" method="POST" modelAttribute="gift"
			class="form">
			<div>
				<form:label path="receiver" class="form-label">Receiver </form:label>
				<form:select path="receiver" class="form-select">
					<c:forEach var="user" items="${users }">
						<option value="${user.id }">${user.username }</option>
					</c:forEach>
				</form:select>
			</div>

			<div>
				<form:label path="sender" class="form-label">Sender </form:label>
				<form:select path="sender" class="form-select">
					<c:forEach var="user" items="${users }">
						<option value="${user.id }">${user.username }</option>
					</c:forEach>
				</form:select>
			</div>
			<div>
				<form:label path="giftName" class="form-label">Gift </form:label>
				<form:input path="giftName" class="form-control" />
				<form:errors path="giftName" class="text-danger" />
			</div>

			<div>
				<form:label path="quantity" class="form-label">Quantity </form:label>
				<form:input path="quantity" type="number" class="form-control" />
				<form:errors path="quantity" class="text-danger" />
			</div>

			<button class="btn btn-primary">Send a gift!</button>

		</form:form>

	</div>
</body>
</html>

