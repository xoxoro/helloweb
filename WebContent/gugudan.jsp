<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	int dan = Integer.parseInt(request.getParameter("dan"));
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1">
	<% //java로 인식되려면 %써야함
		for(int i=1; i<=9; i++){
	%>	
			<tr>
					<td><%=dan%></td>
					<td><%=1%></td>
					<td><%=dan*i%></td>
			</tr>
	<%	
		}
	%>	
		
	</table>
</body>
</html>