<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../../static/css/register.css">
    <meta charset="UTF-8">
    <title>用户注册</title>

    <script>
        function check()
		  {
		  	var password=document.getElementById("password").value;
			var repassword=document.getElementById("repassword").value;
			if(password != repassword){
					alert("密码不一致请核查");
			}
		  }
    </script>

</head>
<body>

<div class="rg_layout">
    <div class="rg_left">
        <p>新用户注册</p>
        <p>USER REGISTER</p>
    </div>

    <div class="rg_center">
        <div class="rg_form">
            <form action="Regist" id="form" method="post">
                <table>
                    <tr>
                        <td class="td_left"><label for="username">用户名</label></td>
                        <td class="td_right">
                            <input type="text" name="username" id="username" placeholder="请输入用户名">
                            <span id="s_username" class="error"></span>
                        </td>
                    </tr>
                    <tr>
                        <td class="td_left"><label for="password">密码</label></td>
                        <td class="td_right">
                            <input type="password" name="password" id="password"  placeholder="请输入密码">
                            <span id="s_password" class="error"></span>
                        </td>
                    </tr>
                    <tr>
                        <td class="td_left"><label for="repassword">确认密码</label></td>
                        <td class="td_right">
                            <input type="password" name="repassword" id="repassword" placeholder="请再次输入密码"  onblur="check()"/>
                            <span id="s_repassword" class="error"></span>
                        </td>
                    </tr>
                    <tr>
                        <td class="td_left"><label for="name">姓名</label></td>
                        <td class="td_right"><input type="text" name="name" id="name" placeholder="请输入姓名"></td>
                    </tr>
                    <tr>
                        <td class="td_left"><label>性别</label></td>
                        <td class="td_right">
                            <input type="radio" name="sex" value="male" checked> 男
                            <input type="radio" name="sex" value="female"> 女
                        </td>
                    </tr>
                    <tr>
                        <td class="td_left"><label for="email">Email</label></td>
                        <td class="td_right"><input type="text" name="email" id="email" placeholder="请输入邮箱"></td>
                    </tr>
                    <tr>
                        <td class="td_left"><label for="department">部门</label></td>
                        <td class="td_right"><input type="text" name="department" id="department" placeholder="请输入部门"></td>
                    </tr>
                    <tr>
                        <td class="td_left"><label for="workspace">工作单位</label></td>
                        <td class="td_right"><input type="text" name="department" id="workspace" placeholder="请输入工作单位"></td>
                    </tr>
                    <br><br>
                    <tr>
                    <p2><td colspan="2" id="td_sub"><input type="submit" id="btn_sub" value="注册"></td></p2>
                    </tr>
                </table>
            </form>
        </div>
    </div>

    <div class="rg_right">
        <p>已有账号?<a href="login" id="login">立即登录</a></p>
    </div>

</div>

</body>
</html>