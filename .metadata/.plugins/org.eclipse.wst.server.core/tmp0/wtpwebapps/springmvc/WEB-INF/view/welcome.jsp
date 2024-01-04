<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Cafe</title>
</head>
<body>
	<h1>Welcome to the cafe</h1>
	
	<div>
		<form action="order" >
			<input type="text" name="ItemName" id="ItemName">
			<button type="submit">submit</button>
		</form>
	</div>
</body>
</html>