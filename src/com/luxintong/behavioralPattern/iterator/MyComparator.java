package com.luxintong.behavioralPattern.iterator;

import java.util.Comparator;

/*
 * Description: 比较器类 MyComparator, 实现了 Comparator 接口, 并实现在接口中声明的 compare()方法
 * */
class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Student s1 = (Student) obj1;
		Student s2 = (Student) obj2;
		if (s1.getSAge() < s2.getSAge()) {
			return 1;
		} else if (s1.getSAge() > s2.getSAge()) {
			return -1;
		} else {
			return 0;
		}
	}
}
