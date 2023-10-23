package com.luxintong.behavioralPattern.iterator;

/*
 * Description: 测试方法
 * */
class MainClass {
	public static void main(String[] args) {
		Class obj = new Class();
		Student student1, student2, student3, student4;
		student1 = new Student("杨过", 20, "男");
		student2 = new Student("令狐冲", 22, "男");
		student3 = new Student("小龙女", 18, "女");
		student4 = new Student("王语嫣", 19, "女");
		obj.addStudent(student1);
		obj.addStudent(student2);
		obj.addStudent(student3);
		obj.addStudent(student4);
		obj.displayStudents();
	}
}
