function login() {

	var username = document.getElementById("username");
	var pass = document.getElementById("password");

	if (username.value == "") {

		alert("请输入用户名");

	} else if (pass.value == "") {

		alert("请输入密码");

	} else if (username.value == "admin" && pass.value == "123456") {

		window.location.href = "";

	} else {

		alert("请输入正确的用户名和密码！")

	}
}
//登入循环
