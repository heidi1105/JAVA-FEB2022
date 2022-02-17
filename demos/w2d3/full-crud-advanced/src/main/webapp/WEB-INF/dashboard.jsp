<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Icecream Menu</h1>
	<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>Flavor</td>
				<td>Price</td>
				<td>Description</td>
				<td colspan="2"></td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="icecream" items="${icecreams }">
				<tr>
					<td>${icecream.getId() }</td>
					<td><a href="/icecreams/${icecream.id}">${icecream.flavor }</a></td>
					<td>${icecream.price }</td>
					<td>${icecream.description }</td>
					<td><a href="/icecreams/edit/${icecream.id }"> Edit </a></td>
					<td>
						<form action="/icecreams/delete/${icecream.id }" method="post">
							<input type="hidden" name="_method" value="delete" />
							<button>Delete</button>
						</form>

					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/icecreams/new"> Create a new flavor </a>
</body>
</html>