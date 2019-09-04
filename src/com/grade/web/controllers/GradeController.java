package com.grade.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domains.GradeBean;
import com.grade.web.serviceImpls.GradeServiceImpl;
import com.grade.web.services.GradeServcie;

@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기까지 잘 오나?");		
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		String sor = request.getParameter("sor");	
		
		GradeBean param = new GradeBean();		
		
		
		param.setKor(kor);
		param.setEng(eng);
		param.setMath(math);
		param.setSor(sor);
		GradeServcie service = new GradeServiceImpl();	
		service.createGrade(param);
		System.out.println("toString찍어봄 ==> " + param.toString());
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
