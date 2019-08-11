package myProjec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServletDemon extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 String username = request.getParameter("username");
         String password = request.getParameter("password");
         String gender = request.getParameter("gender");
         System.out.println("username=" + username);
         System.out.println("password=" + password);
         ServletOutputStream so = response.getOutputStream();
         so.write(("hello," + username).getBytes("utf-8"));
    }
}
