package com.pb.servlet;

import java.io.IOException;
//import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pb.domain.User;
import com.pb.service.UserService;
import com.pb.service.UserServiceImpl;

/**
 * Servlet implementation class add
 */
@WebServlet("/add")
public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("aaaaaaa");
		request.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("uName");
		System.out.println(name);
		String password = request.getParameter("uPass");
		System.out.println(password);
		int sex = Integer.parseInt(request.getParameter("gender"));
		System.out.println(sex);
		String nickname = request.getParameter("nickname");
		String headname = request.getParameter("head");
		//String date = request.getParameter("registerTime");
		UserService userService = new UserServiceImpl();
		User user = userService.findByName(name);
		if(user!=null){
			request.setAttribute("msg", "添加失败");
			request.setAttribute("goUrl", "reg.jsp");
			request.getRequestDispatcher("showMsg.jsp").forward(request,response);
			
		}else{
			user = new User(name,password,sex,nickname,headname);
			userService.add(user);
			response.sendRedirect("login.jsp");
		}
		
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
