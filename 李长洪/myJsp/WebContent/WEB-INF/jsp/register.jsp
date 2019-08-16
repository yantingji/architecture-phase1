<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title></title>
<style type="text/css">
.input_text{
	width:240px;
    border: solid 1px #ccc;
    height: 30px;
    text-indent: 10px;
    
}
.boy{
	margin-top:90px;
}
.input_pwd{
	width:240px;
    border: solid 1px #ccc;
    height: 30px;
    text-indent: 10px;
    
}
#login{
	text-align: center;
}
.input_btn{
	width:240px;
	color:black;
	text-indent: 10px;
	height: 30px;
	background-color:0033FF;
	font-weight:bold;
	border:0px;
}
.div_top{
	font-size:25px; 
}
.div_denglu{
	margin-left: 40%;
	margin-top:20;
	width:100%;
	font-size:15px;
	color:#D0D0D0;
}
.spn_bun{
	margin-top:20px;
}
.mima{
	margin-top:15px;
	color:#000000;
}
.mimar{
	float:right;
}
.mimal{
	float:left;
}
.zhanghao{
	margin-left:0px;
	color:#000000;
	float:right;
	margin-top:20px;	
}
#spanname{
	display:none;
	position: absolute;
    margin-left: 248px;
    margin-top: -25px;
}
#spanpassword{
	display:none;
	position: absolute;
    margin-left: 248px;
    margin-top: -25px;
}
#spanphone{
	display:none;
	position: absolute;
    margin-left: 248px;
    margin-top: -25px;
}
#spanemil{
	display:none;
	position: absolute;
    margin-left: 248px;
    margin-top: -25px;
}
</style>

</head>
<body>
		<div class="boy">
			<div class="div_top"><div id="login">用户注册</div></div>
			<div class="div_denglu">
				<form action=registerloing>
					用户名：<br />
					<input type="text" class="input_text" id="username"><span id="spanname">*姓名不能为空</span><br />
					密码：<br />
					<input type="password" class="input_pwd" id="password"><span id="spanpassword">*密码不能为空</span><br />
					电子邮箱：<br />
					<input type="password" class="input_pwd" id="emil"><span id="spanemil">*邮箱不能为空</span><br />
					年龄：<br />
					<input type="password" class="input_pwd" id="age">
					<br />
					<input type="checkbox" id="xuke">我已阅读许可
					<div class="spn_bun">
					<input type="submit" disabled="disabled" class="input_btn" value="注册" id="btn">
					</div>
				</form>
			</div>
	</div>
</body>
<script type="text/javascript">
//验证
document.getElementById("btn").onclick = function () {
var username = document.getElementById("username");
var password = document.getElementById("password");
var phone = document.getElementById("phone");
var emil = document.getElementById("emil");
var spanname = document.getElementById("spanname");
var spanpassword = document.getElementById("spanpassword");
var arrInput = document.getElementsByTagName("input");
var arrSpan = document.getElementsByTagName("span");
if (username.value == "") {
	alert("用户名不能为空");
    for (var i = 0; i < arrInput.length; i++) {
    	arrInput[i].style.border="1px solid";
    }
    for (var i = 0; i<arrSpan.length;i++) {
    	arrSpan[i].style.display="none";
		 };
	username.style.border="#f00 1px solid";
	spanname.style.display="block";
	username.style.backgroundColor = "#F3D3E7";
} else if (password.value == "") {
	alert("密码不能为空");
    for (var i = 0; i < arrInput.length; i++) {
    	arrInput[i].style.border="1px solid";
    }
    for (var i = 0; i<arrSpan.length;i++) {
    	arrSpan[i].style.display="none";
		 };
    password.style.border="#f00 1px solid";
    spanpassword.style.display="block";
    password.style.backgroundColor = "#F3D3E7";
} else if (emil.value == "") {
	alert("邮件不能为空");
	for (var i = 0; i < arrInput.length; i++) {
		arrInput[i].style.border="1px solid";
    }
	for (var i = 0; i<arrSpan.length;i++) {
    	arrSpan[i].style.display="none";
		 };
	emil.style.border="#f00 1px solid";
	spanemil.style.display="block";
	emil.style.backgroundColor = "#F3D3E7";
}
} 
//定时器
 document.getElementById("xuke").onclick  = function () {

	document.getElementById("btn").disabled=false;
	document.getElementById("btn").style.color="#F0F0F0";
}


</script>
</html>