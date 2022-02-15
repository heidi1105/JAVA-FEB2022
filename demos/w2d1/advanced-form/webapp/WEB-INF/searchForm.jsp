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
	<h1>Search form</h1>
	<form action="/searchProcess" method="get">
		<p>
			<label> Search for...</label> 
			<input type="text" name="keyword" />
		</p>
		<button>Search</button>

	</form>
</body>
</html>