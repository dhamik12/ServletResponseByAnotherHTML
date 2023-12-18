package com.soumik;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MyServlet2() {
        super();
        System.out.println("Welcome to Servlet..");
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userName=request.getParameter("name");
		String userAge=request.getParameter("age");
		String userGender=request.getParameter("gender");
		String userEmail=request.getParameter("email");
		String userNumber=request.getParameter("number");
		
		System.out.println(userName+":"+userAge+":"+userGender+":"+userEmail+":"+userNumber);
		
		response.sendRedirect("/ResponseByHtml2/response.html");
	}

}
