package com.grade.web.services;

import com.grade.web.domains.GradeBean;

public interface GradeServcie {
	void createGrade(GradeBean param);
	public void sumGrade(GradeBean param);
	public void avgGrade(GradeBean param);	
	public String today(GradeBean param);
	
}
