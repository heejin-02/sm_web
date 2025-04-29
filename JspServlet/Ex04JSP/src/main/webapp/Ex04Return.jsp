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
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String opr = request.getParameter("opr");
		
		int i_num1 = Integer.parseInt(num1);
		int i_num2 = Integer.parseInt(num2);
		
		int sum= 0;
		
		
		if(opr.equals("plus")) {
			out.print(i_num1+"+"+i_num2+"=");
			sum = i_num1+i_num2;
		}
		else if(opr.equals("minus")) {
			out.print(i_num1+"-"+i_num2+"=");
			sum = i_num1-i_num2;
		}
		else if(opr.equals("times")) {
			out.print(i_num1+"*"+i_num2+"=");
			sum = i_num1*i_num2;
		}
		else if(opr.equals("devide")) {
			out.print(i_num1+"/"+i_num2+"=");
			sum = i_num1/i_num2;
		}
		
		
	%>
		<%= sum %>
</body>
</html>