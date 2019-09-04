package com.grade.web.serviceImpls;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.grade.web.daoImpls.GradeDAOImpl;
import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;
import com.grade.web.services.GradeServcie;

public class GradeServiceImpl implements GradeServcie{
	
	private GradeDAO dao;
	
	public GradeServiceImpl() {
		dao = new GradeDAOImpl();
	}

	@Override
	public void createGrade(GradeBean param) {		
		
		param.getKor();
		param.getEng();
		param.getMath();
		param.getSor();	
		param.setDate(today(param));
		dao.insertGrade(param);
		
	}
	
	@Override
	public void sumGrade(GradeBean param) {
		int sum = Integer.parseInt(param.getKor()) 
				+ Integer.parseInt(param.getEng()) 
				+ Integer.parseInt(param.getMath()) 
				+ Integer.parseInt(param.getSor());
		param.setSum(sum);
		dao.insertGrade(param);
	}

	@Override
	public void avgGrade(GradeBean param) {
		int avg = param.getSum()/4;
		param.setAvg(avg);
		dao.insertGrade(param);
	}

	@Override
	public String today(GradeBean param) {
		Date date = new Date();
		SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(today);
		param.setDate(today.format(date));
		
		return param.getDate();
	}


	

}
