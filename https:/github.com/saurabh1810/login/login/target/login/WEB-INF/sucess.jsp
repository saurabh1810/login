<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./">
<h1>${msg }</h1>
	<table>
		
		<tr>
			<td>Username:</td>
			<td>${user.username}</td>
		</tr>
		
		<tr>
			<td>Email:</td>
			<td>${user.email}</td>
		</tr>
		<tr>
			<td>Password:</td>
			<td>${user.password}</td>
		</tr>
		
	</table>
	<div><input type="submit" value="Back to create"/></div>
</form>
</body>
</html>