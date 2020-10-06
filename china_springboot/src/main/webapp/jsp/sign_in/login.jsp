<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <%--<base href="http://localhost:8080/china_springboot/">--%>
    <link rel="stylesheet" href="../../static/css/body.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录页面</title>
</head>
<body id="body">
<div id="center">
    <div id="center_form">
        <form method="post" action="Login">
            <p>用户名：<input type="text" name="username" class="input"></p>
            <p>密码：<input type="password" name="password" class="input" id="password"></p>
            <a herf="Login"><input type="submit" id="Login"value="登录" class="button"></a>
            <input type="reset" value="重置" class="button">
            <br>
            <a href="register" id="register">立即注册</a>
        </form>
    </div>
</div>
</body>
</html>