<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
response.setHeader("Cache-control", "no-cache");
response.setHeader("Cache-Control","no-store");

%>

<form action="./">
<%-- <h1>${msg }</h1> --%>
	<table>
	
	<tr>
			<td>Username:</td>
			<td>${user.username}</td>
		</tr>
		
		<tr>
			<td>email:</td>
			<td>${user.email}</td>
		</tr>
		<tr>
			<td>password:</td>
			<td>${user.password}</td>
		</tr>
	</table>
	<div><input type="submit" value="LOGOUT"/></div>
</form>
</body>
</html>