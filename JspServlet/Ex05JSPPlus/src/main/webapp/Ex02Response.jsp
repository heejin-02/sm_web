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
	
		String name = request.getParameter("name");
		int java = Integer.parseInt(request.getParameter("java"));
		
		if(java >= 60) {
			out.print(name + "PASS");
		} else {
			out.print(name + "재시험 당첨");
		}
	%>
</body>
</html>