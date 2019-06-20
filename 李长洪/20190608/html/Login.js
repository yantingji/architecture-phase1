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
} else if (phone.value == "") {
	alert("手机不能为空");
	for (var i = 0; i < arrInput.length; i++) {
		arrInput[i].style.border="1px solid";
    }
	for (var i = 0; i<arrSpan.length;i++) {
    	arrSpan[i].style.display="none";
		 };
	phone.style.border="#f00 1px solid";
	spanphone.style.display="block";
	phone.style.backgroundColor = "#F3D3E7";
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
}else{
	var aa = emil.value
	for (var i = 0; i < aa.length; i++) {
		if (aa[i]=" "){
			alert("bb");
			return;
		}
    }
	alert("aa");
} 
}
//定时器
 document.getElementById("xuke").onclick  = function () {
var time = setTimeout(function () {
	document.getElementById("btn").disabled=false;
	document.getElementById("btn").style.color="#F0F0F0";
        }, 3000);
}
