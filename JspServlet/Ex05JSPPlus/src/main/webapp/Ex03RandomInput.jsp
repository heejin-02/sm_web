<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% int RanNum = Integer.parseInt(request.getParameter("RanNum")); %>
	<form action="Ex03RandomOutput.jsp">
		<p>랜덤뽑기</p><br>
		주제: <input type="text" name="topic"><br>
		<%
		for (int i=1; i<=RanNum; i++) {
			out.print("아이템:");
			out.print("<input type=\"text\" name=\"item\"");	
			out.print("<br>");
		}
		%>
		<input type="submit" value="랜덤뽑기">
		
	
	</form>
</body>
</html>