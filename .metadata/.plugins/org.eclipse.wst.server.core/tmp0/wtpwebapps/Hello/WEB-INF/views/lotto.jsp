<%@page import="java.util.Random"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>로또 보기</title>
</head>
<body>
<%
	int[] lottos = new int[6];
	Random r = new Random();
	int lottoNum =0;
	for(int lotto:lottos){
		lotto = 0;
	}
	
	int cnt = 0;			
		while(true){
			lottoNum = r.nextInt(45)+1;
			boolean duplicate = false;
			
			for(int j=0;j<=cnt;j++){
				if(lottoNum==lottos[j]){
					duplicate=true;				
				}
			}
			
			if(!duplicate){
				lottos[cnt] = lottoNum;		
				cnt++;
			}
							
			if(cnt==6){
				break;
			}
		}		
		
		
	
	for(int lotto:lottos){
		out.print("로또번호 : "+lotto+"<br>");
	}
	
	
	
%>
</body>
</html>
