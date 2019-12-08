
package com.capgemin.map.TreeArrayMap;

public class Student implements Comparable<Student>{
	String name;
	int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";//stringis  comparable object
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
	

}
