package src.object191209.model.vo;

public class Student {

	private String name;
	private int age;
	private char gender;
	
	public Student() {}
	
	public Student(String name) {
		this.name = name;
	}
	public Student(int age) {
		this.age = age;
	}
	public Student(char gender) {
		this.gender = gender;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
	
}
