<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title></title>
<style type="text/css">
body {background:url(E:/work/myJsp/WebContent/jsp/images/loginbj.png)}
a {text-decoration: none}
#top1{
	display: flex;
	justify-content: space-between;
	margin-right: 30px;
}
#reghtdiv{
	float:right;
	width:30%;
	margin-right:20px;
}
#user{
	font-size:20px;
	color: blanchedalmond;
	}

</style>
</head>
<body>
	<div id="reghtdiv">
		<div id="top1"><span><a href="#">首页</a></span><span><a href="#">链接1</a></span><span><a href="#">链接2</a></span><span><a href="#">链接3</a></span></div>
	</div>
     <div id="user">用户：<%=request.getParameter("username")%></div>
</body>
</html>
