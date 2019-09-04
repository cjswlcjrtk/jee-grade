package com.grade.web.domains;

import java.io.Serializable;

public class GradeBean implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	private String kor, eng, math, sor, date;
	private int sum, avg;

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getSor() {
		return sor;
	}

	public void setSor(String sor) {
		this.sor = sor;
	}	

	
	

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "GradeBean [kor=" + kor + ", eng=" + eng + ", math=" + math + ", sor=" + sor + "]";
	}

	
	

}
