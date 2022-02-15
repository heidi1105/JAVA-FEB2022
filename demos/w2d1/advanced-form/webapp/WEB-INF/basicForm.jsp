<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Basic Form</h1>
	<form action="/processBasicForm" method="POST">
		<input type="hidden" name="sender" value="Heidi" />
		<p>
			<label> Receiver </label>
			<input type="text" name="receiver" />
		</p>
		<p>
			<label> Amount </label>
			<input type="number" name="amount" />
		</p>	
		<button> Send </button>
	</form>
	<p>${error }</p>
	
</body>
</html>