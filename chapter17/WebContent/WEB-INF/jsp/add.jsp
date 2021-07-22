<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加页面</title>
</head>
<body>
	<div style="height: 50px;"></div>
	<form method="post" action="add">
		<table border="1" align="center" style="text-align: center;">
			<tr>
				<td colspan="2">添加信息</td>
			</tr>
			<tr>
				<td>id</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>countrycode</td>
				<td><input type="text" name="countrycode" /></td>
			</tr>
			<tr>
				<td>district</td>
				<td><input type="text" name="district" /></td>
			</tr>
			<tr>
				<td>population</td>
				<td><input type="text" name="population" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="添加" /></td>
			</tr>
		</table>
	</form>
</body>
</html>