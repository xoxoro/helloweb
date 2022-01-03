package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	//필드
	private static final long serialVersionUID = 1L;
       
	//생성자->기본 생성자 사용할건데 생략가능
//    public HelloServlet() { }
    
    //메소드 gs
    
    //메소드-일반
	//Form태그(get방식/post방식)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//코드작성
		response.setContentType("text/html;charset=utf-8");//한글 안깨지게 하는 코드
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("	<head>");
		out.println("		<meta charset=\"UTF-8\">");
		out.println("		<title>Insert title here</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h1>helloworld.jsp!!!!안녕 jsp!!!!</h1>");
		out.println("	</body>");
		out.println("</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
