package src.io.model.vo;

import java.io.Serializable;

public class Student implements Serializable{

	private String name;
	private int age;
	private int num;
	public Student() {}
	public Student(String name, int age,int num) {
		super();
		this.name = name;
		this.age = age;
		this.num=num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {//얘는 만들어놔야함 그래야 리턴값이 나옴
		return "학생이름 =" + name + ", 학생나이=" + age + ", 학생번호=" + num +"]";
	}
}
