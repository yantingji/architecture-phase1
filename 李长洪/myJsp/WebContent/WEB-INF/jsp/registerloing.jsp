<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="myProjec.PreparedStatementDemo" %>
<html>
<head>
<title>跳转界面</title>
</head>
<body>
LODING。。。
<%
String name = request.getParameter("username");
String password = request.getParameter("password");
String emil = request.getParameter("emil");
int age = Integer.parseInt(request.getParameter("age"));

PreparedStatementDemo pr = new PreparedStatementDemo(); 
pr.register(name, password, emil, age);
%>


</body>
</html>
