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
	// request.getAttribute는 attribute를 object 형태로
	// 가져오기 때문에 String으로 형변환을 해야 함!
		String message = (String)request.getAttribute("test");
	%>
	<p>저장된 스코프 값 확인해보기</p>
	<p>page scope : <%= pageContext.getAttribute("test") %></p>
	<p>request scope : <%= message%></p>
	<p>session scope : <%= session.getAttribute("test") %></p>
	<p>application scope : <%= application.getAttribute("test") %></p>
	
</body>
</html>