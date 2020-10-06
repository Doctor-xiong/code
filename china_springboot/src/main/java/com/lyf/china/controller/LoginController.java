package com.lyf.china.controller;

import com.lyf.china.bean.User;
import com.lyf.china.service.UserService;
import com.lyf.china.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {

    @RequestMapping("/index")
    public String index(){
        return  "/jsp/index.jsp";
    }

    @RequestMapping("/login")
    public String login(){
        return "/jsp/sign_in/login.jsp";
    }
    @RequestMapping("/sign_in/login")
    public String sig_in_login(){
        return "/jsp/sign_in/login.jsp";
    }

    @RequestMapping("/register")
    public String register(){
        return "/jsp/sign_in/register.jsp";
    }
    @RequestMapping("/sign_in/register")
    public String sign_in_register(){
        return "/jsp/sign_in/register.jsp";
    }

    private UserService service = new UserServiceImpl();

    @RequestMapping("/sign_in/Login")
    public void registration(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //2、封装为user对象
        User user = new User(null, username, password, null, null, null, null);
        //3、调用userservice处理登录业务
        User bean = service.login(user);
        //4、判断
        if(bean == null){
            //查询失败，用户不存在，转发到登录页面继续登录
            // request.getRequestDispatcher("/login.jsp").forward(request, response);
            response.sendRedirect("/jsp/sign_in/error.html");
        }else{
            //查询成功，重定向到成功页面
//            response.sendRedirect(request.getContextPath()+"/jsp/sign_in/success.html");
            response.sendRedirect("/jsp/sign_in/success.html");
        }
    }
    @RequestMapping("/sign_in/Regist")
    public void registration2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //1、获取用户注册信息
        String username = request.getParameter("username"); // 用于读取提交的表单中的值
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String tmp = request.getParameter("sex");
        int sex = -1;
        if (tmp.equals("男"))
            sex = 1;
        else
            sex = 0;
        String department = request.getParameter("department");
        String workspace = request.getParameter("workspace");
        String email = request.getParameter("email");
        //2、将注册信息封装成user对象
        User user = new User(null, username, password, name, sex, department, workspace, email);
        //3、调用UserService的处理业务
        boolean b = service.regist(user);
        //	int i = dao.saveUser(user);
        //如果i>0代表注册成功 重定向到成功页面,如果i<=0 代表注册失败，转发到注册页面让用户继续注册
        if(b){
            //重定向绝对路径 需要添加项目名
            //response.sendRedirect(request.getContextPath()+"/pages/user/regist_success.html");
            response.sendRedirect("/jsp/sign_in/success.html");
        }else{
            //失败  转发
            // request.getRequestDispatcher("/pages/user/regist.html").forward(request, response);
            response.sendRedirect("/jsp/sign_in/error.html");
        }
    }
}

