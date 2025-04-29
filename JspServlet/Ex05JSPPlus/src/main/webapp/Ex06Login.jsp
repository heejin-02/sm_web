<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  
	받아온 아이디/비번 값을 변수에 저장하고
	id smart/ pw 123 둘다 일치하면
	=> Ex06LoginSuccess
	
	다르면
	=> Ex06LoginFail
	 -->
	 
	 <%
	 	String id = request.getParameter("id");
	 	String pw = request.getParameter("pw");
	 	
	 	
	 	if(id.equals("smart") && pw.equals("123")) {
	 		response.sendRedirect("Ex06LoginSuccess.jsp?user="+id);
	 		
	 	}
	 	else{
	 		response.sendRedirect("Ex06LoginFail.jsp");
	 	}
	 %>
</body>
</html>