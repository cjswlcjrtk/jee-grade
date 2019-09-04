package com.grade.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domains.StudentBean;
import com.grade.web.pool.Constants;
import com.grade.web.serviceImpls.StudentServiceImpl;
import com.grade.web.services.StudentService;

@WebServlet("/student.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기까지 잘 오나?");	
		System.out.println("action갑 확인 "+request.getParameter("action"));
		switch(request.getParameter("action")) {
		case "move" :
			request.getRequestDispatcher(
					String.format(
							Constants.VIEW_PATH,
							request.getParameter("directory"),
							request.getParameter("dest"))).forward(request, response);			
			break;				
		case "login" :
			System.out.println("login까지 잘 오나?");	
			String rrn = request.getParameter("rrn");
			String name = request.getParameter("name");
			
			StudentBean param = new StudentBean();
			
			param.setRrn(rrn);
			param.setName(name);
			
			StudentService service = new StudentServiceImpl();
			service.createStudent(param);
			System.out.println("toString찍어봄 ==> " + param.toString());
			request.getRequestDispatcher(
					String.format(
							Constants.VIEW_PATH,
							request.getParameter("directory"),
							request.getParameter("dest"))).forward(request, response);	
			break;		
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
