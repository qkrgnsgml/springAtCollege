<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<%
	
	
	for(int i =2; i<10;i++){
		for(int j=1;j<10;j++){
			out.print(i+" x "+j+"= "+i*j +" / ");
		}
		out.print("<br>");
	}

%>
<a href="/">메인</a>
</body>
</html>
