<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title></title>
<style type="text/css">
body {background:url(.loginbj.png)}
a {text-decoration: none}
.top1{
	display: flex;
	justify-content: space-between;
	margin-right: 30px;
}
#input_user{
	width:240px;
    border: solid 1px #ccc;
    height: 30px;
    text-indent: 10px;
    
}
.reghtdiv{
	float:right;
	width:30%;
	margin-right:20px;
}
#boy{
	text-align:center;
	margin-top:90px;
}
#input_pwd{
	width:240px;
    border: solid 1px #ccc;
    height: 30px;
    text-indent: 10px;
    
}
#input_btn{
	width:240px;
	text-indent:10px;
	height:30px;
	background-color:0033FF;
	font-weight:bold;
	border:0px;
	color:#F0F0F0;
}
#div_top{
	font-size:25px;
	margin-left:-40px;
}
.div_denglu{
	margin-top:20;
	width:240px;
	text-align:left;
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
.lianjie{
	color:#3300CC;
	text-decoration:none; 
	font-weight:bold;
}
#leftdiv{
	padding-top: 140px;
    margin-left: 50px;
}
.span_1{
	font-size:32px;
	font-weight:bold;
}
.span_2{
	font-weight:bold;
	font-size:18px;
}
.span_3{
	height:10px;
}
.span_4{
	height:10px;
}
.span_5{
	height:10px;
}
.span_6{
	height:10px;
}
.div_xia{
	    margin-top:60px;
}
#btn{
	margin-left:25%;
	position: fixed;
	bottom:20;	
}
#boyin{
	width: 70%;
	}
.span1_reght{
	    margin-left: 20px;
}
</style>
</head>
<body>
	<div class="reghtdiv">
		<div class="top1"><span><a href="#">首页</a></span><span><a href="#">链接1</a></span><span><a href="#">链接2</a></span><span><a href="#">链接3</a></span></div>
		<div id="boy">
        	<div id="boyin">
                <div id="div_top">用户登陆</div>
                <div class="div_denglu">
             <form action=check method="post">
                        用户名：<br />
                        <input type="text" name="username" id="input_user"><br />
                        密码：<br />
                        <input type="password" name="password" id="input_pwd"><br />
                        <div class="spn_bun">
                        <input type="submit" id="input_btn" value="登陆">
                        </div>
                        <div class="mima">
                            <span class="mimal"><input type="checkbox"><a>记住密码</a></span>
                            <span class="mimar">忘记密码</span>
                        </div>
                        <div class="zhanghao">
                        没有账号？<a href=register class="lianjie">点击注册</a>
                        </div>
                    </form>
                </div>
         </div>
	</div>
</div>
	<div id="leftdiv">
		<div>
			<span class="span_1"><span>海量品牌</span><span class="span1_reght">信息共享</span></span><br />
			<span class="span_2">数据结合商业,让大数据发挥大价值</span><br />
		</div>
		<div class="div_xia">
		<div class="span_3">精准营销,数据化管理，提升管理水平。</div><br />
		<div class="span_4">打造线上线下数字一体化。</div><br />
		<div class="span_5">双选平台，建立工厂与经销商双向选择平台。</div><br />
		<div class="span_6">服务市场，塑造经销商信用等级，为其提供相应的金融服务。</div>
		</div>
	</div>
	<div id="btn">
		|关于我们|诚聘人才|联系商家|广告服务|浙江省宁波市鄞州区xx路666号xxx公司Camping2018-2010
	</div>	
</body>
<script type="text/javascript">
document.getElementById("input_btn").onclick = function () {
	var username = document.getElementById("input_user");
	var password = document.getElementById("input_pwd");
	
	if (username.value == "") {
		alert("用户名不能为空");
		username.style.border="#f00 1px solid";
		username.style.backgroundColor = "#F3D3E7";
	} else if (password.value == "") {
		alert("密码不能为空");
		password.style.border="#f00 1px solid";
	}
}
</script>
</html>
