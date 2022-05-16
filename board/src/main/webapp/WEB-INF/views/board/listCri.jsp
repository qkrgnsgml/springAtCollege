<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 	pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<%@include file="../include/header.jsp" %>
<h1>
	게시물 목록
</h1>

<table>
	<tr>
		<th>BNO</th>
		<th>Title</th>
		<th>Writer</th>
		<th>RegDate</th>
		<th>View</th>
	</tr>
	<c:forEach items="${list}" var="boardVO">
	<tr>
		<td>${boardVO.bno }</td>
		<td>
			<a href="/board/read?bno=${boardVO.bno}">${boardVO.title }</a>
		</td>
		<td>${boardVO.writer }</td>
		<td>${boardVO.regdate }</td>
		<td>${boardVO.viewcnt }</td>
	</tr>
</c:forEach>
</table>



<P>  The time on the server is ${serverTime}. </P>

<%@include file="../include/footer.jsp" %>
</body>
</html>



