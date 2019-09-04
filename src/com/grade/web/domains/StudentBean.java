package com.grade.web.domains;

import java.io.Serializable;

public class StudentBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String numseq, rrn, name;

	public String getNumseq() {
		return numseq;
	}

	public void setNumseq(String numseq) {
		this.numseq = numseq;
	}

	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Studentbean [numseq=" + numseq + ", rrn=" + rrn + ", name=" + name + "]";
	}
	
	
}
