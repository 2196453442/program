/*package com.dzkj.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.dzkj.Mapper.IUsersMapper;
import com.dzkj.pojo.Users;

import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	SqlSessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		SqlSession session= sessionFactory.openSession();
		IUsersMapper um=session.getMapper(IUsersMapper.class);
		
		Users users=new Users();
		users.setUname(username);
		users.setPwd(password);
		Users user=um.selectOne(users);
		if(user!=null){//��¼�ɹ�
			request.getSession().setAttribute("user", user);
			response.sendRedirect("index.jsp");
			
		}else{
			//request.setAttribute("msg", "��¼ʧ��");
			Cookie cookie =new Cookie("msg", "�û������������");
			cookie.setMaxAge(1);
			response.addCookie(cookie);
			response.sendRedirect("login.jsp");
		}
		session.close();
	}

		out.flush();
		out.close();
	}

}
*/