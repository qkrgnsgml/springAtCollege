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
	게시물수
</h1>

<form role="form" method="post">
	<div>
	<label>BNO</label>
	<input type="text" name="bno" value="${boardVO.bno }" readonly>
	</div>
	
	<div>
		<label>Title</label>
		<input type="text" name="title" value="${boardVO.title }">
	</div>
	
	<div>
		<label>Content</label>
		<textarea name="content" rows="3">
		${boardVO.content }
		</textarea>
	</div>
	


</form>

<button type="submit" class="modify">SAVE</button>
<button type="submit" class="listall">취소</button>

<script>
	$(document).ready(function(){
		var formObj = $("form[role='form']");
		console.log(formObj);
		
		$(".modify").on("click", function(){
			formObj.attr("action", "/board/modify")
			formObj.attr("method", "post");
			formObj.submit();
		});
		
		$(".listall").on("click", function(){
			self.location = "/board/listAll";
		});
	});
	
</script>

<%@include file="../include/footer.jsp" %>
</body>
</html>



