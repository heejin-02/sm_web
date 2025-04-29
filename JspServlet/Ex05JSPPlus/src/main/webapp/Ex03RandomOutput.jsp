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
		String[] items = request.getParameterValues("item");
		int randomIndex = (int)(Math.random() * items.length);
		String randomItem = items[randomIndex];
	%>
	<p> 오늘 점심 메뉴는? : <%=randomItem %></p>
	
</body>
</html>