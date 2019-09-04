package com.grade.web.daoImpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.grade.web.daos.StudentDAO;
import com.grade.web.domains.StudentBean;
import com.grade.web.pool.Constants;

public class StudentDAOImpl implements StudentDAO{

	//학번 이름
	@Override
	public void insertStudent(StudentBean param) {
		try {
			File file = new File(Constants.FILE_PATH + "student.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = 
					new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format(
					"%s %s", 
					param.getNumseq(),
					param.getName()));
			writer.newLine();
			writer.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
