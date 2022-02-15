<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Reservation Confirmation</h1>
<ul>
	<li> Name: ${name }</li>
	<li> Number of people : ${people }</li>
	<li> Reservation Date: ${resDate }</li>
	<li> Formatted Date: 
		<fmt:formatDate type="date" value="${resDate}" />  
	</li>	
	<li> Reservation Time: ${resTime }</li>
	<li> Formatted Time: 
		<fmt:formatDate type="time" pattern="hh:mm a" value="${resTime}" />  
	</li>


</ul>
</body>
</html>