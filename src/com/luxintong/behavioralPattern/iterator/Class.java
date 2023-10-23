package com.luxintong.behavioralPattern.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
 * Description: 聚合类，在其中定义了一个 ArrayList 类型的集合, 用于存储 Student 对象
 * */
class Class {
	private ArrayList<Student> students = new ArrayList<Student>();

	public void addStudent(Student student) {
		students.add(student);
	}

	public void displayStudents() {
		// 创建一个比较器对象用于排序
		Comparator comp = new MyComparator();
		Collections.sort(students, comp);
		// 再创建一个迭代器对象用于遍历集合
		Iterator i = students.iterator();
		while (i.hasNext()) {
			Student student = (Student) i.next();
			System.out.println(" 姓名： " + student.getSName() + " ，年龄： " + student.getSAge());
		}
	}
}