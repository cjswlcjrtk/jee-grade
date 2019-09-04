package com.grade.web.serviceImpls;

import java.util.Random;

import com.grade.web.daoImpls.StudentDAOImpl;
import com.grade.web.daos.StudentDAO;
import com.grade.web.domains.StudentBean;
import com.grade.web.services.StudentService;

public class StudentServiceImpl implements StudentService{
	
	private StudentDAO dao;
	
	public StudentServiceImpl() {
		dao = new StudentDAOImpl();
	}

	@Override
	public void createStudent(StudentBean param) {
		
		String num = "";
		for(int i=0; i<3; i++) {
			num += new Random().nextInt(10)+"";
		}
		String result = "2019-" 
				+ param.getRrn().substring(7,8)+num;		
		param.setNumseq(result);
		param.getName();
		System.out.println("result=" + result);
		dao.insertStudent(param);
		
	}

}
