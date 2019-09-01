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
<h1>Create</h1>
	<form action="./create" method="post">
		<div align="center">
			<table>
				
				<tr>
					<td>Username</td>
					<td><input type="text" name="username" /></td>
				</tr>
				
				<tr>
					<td>email</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>password</td>
					<td><input type="text" name="password" /></td>
				</tr>
				<tr>

				<tr>
					<td></td>
					<td><input type="submit" value="create" /></td>
				</tr>

			</table>

		</div>
	</form>
	
	
	
	
	
	
	<h1>LOGIN</h1>
	<form action="./l" method="post">
		<div align="center">
			<table>
				
				<tr>
					<td>Username</td>
					<td><input type="text" name="username" /></td>
				</tr>
				
				<tr>
					<td>email</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>

				<tr>
					<td></td>
					<td><input type="submit" value="LOGIN" /></td>
				</tr>

			</table>

		</div>
	</form>
</body>
</html>