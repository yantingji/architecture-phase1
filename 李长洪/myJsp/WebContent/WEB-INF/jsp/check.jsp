<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="myProjec.PreparedStatementDemo" %>
<html>
<head>
<title>跳转界面</title>
</head>
<body>
LODING。。。
<%
boolean flag = false;
String name = request.getParameter("username");
String password = request.getParameter("password");
%>
<% 
PreparedStatementDemo pr = new PreparedStatementDemo(); 
flag = pr.userCheck(name);
%>

<%
if(flag) {

%>

<jsp:forward page="homePage" />

<%
}
else {
%>
<jsp:forward page="login"/>
<%
}
%>

</body>
</html>
