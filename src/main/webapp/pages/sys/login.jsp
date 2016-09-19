<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String baseURL=request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<c:import url="/pages/include/pageHead.jsp" />
<style>
body{
	background:url(static/img/login_bg.jpg) no-repeat;
	 background-size:100%;
	 background-color:#037192}
.logo{
		text-align:center;
		padding-top:6%; 
		padding-bottom:4%;}
	
</style>
<script type="text/javascript">

</script>
</head>
<body id="login" >
<div class="logo"><img src="static/img/login_logo.png" /></div>


<div class="container">
<form class="form-signin" id="loginform" method="post" action="${basepath}/doLogin">
 <input type="text" class="input-block-level" placeholder="用户名" name="username" id="userloginName" /><br>
  
       <input type="password" class="input-block-level" placeholder="密码" name="password" id="userpassword" /><br>
       <img src="${basepath}/img"/><br/>
      <input type="text" class="input-block-level" placeholder="验证码" name="captcha" id="captcha" /><br>
     	 <div class="alert alert-error"
							style="display: none;text-align: center;width:83.5%; " id="errormessagename" >
							<button class="close" onclick="close()" >&times;</button>
							<strong><span id="messageeename">请填写用户名或密码</span></strong>
						</div>

        <button class="btn btn-large btn-block btn-info"  type="submit" >登录</button>
</form>
</div>



</body>

</html>