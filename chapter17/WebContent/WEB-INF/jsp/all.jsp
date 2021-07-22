<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>all</title>
</head>
<body>
<table border="1px">
	<thead>
		<tr>
			<td>id</td>
			<td>name</td>
			<td>countrycode</td>
			<td>District</td>
			<td>population</td>
			<td colspan ="2">操作</td>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="city" items="${cities }">
		<tr>
			<td>${city.id}</td>
			<td>${city.name}</td>
			<td>${city.countrycode}</td>
			<td>${city.district}</td>
			<td>${city.population}</td>
			<td><a href="${pageContext.request.contextPath }/updateCity?id=${city.id}">修改</a></td>
			<td><a href="${pageContext.request.contextPath }/delete?id=${city.id}">删除</a></td>
		</tr>
		</c:forEach>
	</tbody>
		<tfoot>
			<tr>
				<td colspan="4" align="center"><a href="${pageContext.request.contextPath }/all">刷新</a></td>
				<td colspan="4" align="center"><a href="${pageContext.request.contextPath }/addCity">添加</a></td>
			</tr>
		</tfoot>

</table>
 
</body>
</html>