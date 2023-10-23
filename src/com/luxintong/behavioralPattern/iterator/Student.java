package com.luxintong.behavioralPattern.iterator;

/*
 * Description: 学生类
 * */
class Student {
	private String sName;
	private int sAge;
	private String sSex;

	public Student(String sName, int sAge, String sSex) {
		this.sName = sName;
		this.sAge = sAge;
		this.sSex = sSex;
	}

	public String getSName() {
		return (this.sName);
	}

	public void setSName(String sName) {
		this.sName = sName;
	}

	public int getSAge() {
		return (this.sAge);
	}

	public void setSAge(int sAge) {
		this.sAge = sAge;
	}

	public String getSSex() {
		return (this.sSex);
	}

	public void setSSex(String sSex) {
		this.sSex = sSex;
	}
}
