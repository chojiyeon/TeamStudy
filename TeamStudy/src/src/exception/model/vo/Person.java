package src.exception.model.vo;

public class Person {

	private String name;
	private int age;
	public Person() {}
	public Person(String name, int age) {
		this.age=age;
		this.name=name;
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
	@Override
	public String toString() {
		return  name + "은(는) 나이가" + age + "입니다.";
	}
	
	
}
