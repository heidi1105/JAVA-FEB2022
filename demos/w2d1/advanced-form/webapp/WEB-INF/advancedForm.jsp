<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Reservation Form</h1>
	<form action="/advancedForm" method="POST">
		<div>
			<label> Name: </label> 
			<input type="text" name="name" />
		</div>
		<div>
			<label> Number of people: </label> 
			<input type="number" name="people" />
		</div>
		<div>
			<label> Date: </label> 
			<input type="date" name="resDate" />
		</div>
		<div>
			<label> Time: </label> 
			<input type="time" name="resTime" />
		</div>
		<button> Reserve! </button>


	</form>


</body>
</html>