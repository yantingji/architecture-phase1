package myProjec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServletDemon extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String html = "<html>" 
			    + "<head>" 
				+ "<title>" 
			    + "登录" 
				+ "</title>" 
			    + "</title>" 
				+ "</head>" 
			    + "<body>"
				+ "<form action=\"http://localhost:8080/season10_01/login\" method=\"post\">"
				+ "<p>用户名：<input type=\"text\" name=\"username\"></p>"
				+ "<p>�?&nbsp;码：<input type=\"password\" name=\"password\" ></p>"
				+ "<p><input type=\"submit\" value=\"登录\"></p>" 
				+ "</form>" 
				+ "</body>" 
				+ "</html>";

		ServletOutputStream so = response.getOutputStream();
		so.write(html.getBytes("utf-8"));

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.doPost(req, resp);
	}
}
