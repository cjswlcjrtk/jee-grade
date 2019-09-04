package com.grade.web.daoImpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;
import com.grade.web.pool.Constants;

public class GradeDAOImpl implements GradeDAO{

	
	//국어 영어 수학 사회 평균 총점
	@Override
	public void insertGrade(GradeBean param) {
		try {
			File file = new File(Constants.FILE_PATH + "grade.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = 
					new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format(
					"%s %s %s %s %s %s %s", 
					param.getDate(),
					param.getKor(),
					param.getEng(),
					param.getMath(),
					param.getSor(),
					param.getSum(),
					param.getAvg()));
			writer.newLine();
			writer.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
