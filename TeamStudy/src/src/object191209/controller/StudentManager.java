package src.object191209.controller;

import java.util.Scanner;

import src.object191209.model.vo.Student;

public class StudentManager {
	private int objectNum=0;
	private String name;
	private int age;
	private char gender;
	Scanner sc=new Scanner(System.in);
	Student s[]=new Student[2];
	Student ss=new Student(); 
	
	public void insertName() {
		// TODO Auto-generated method stub
		System.out.println("이름을 입력하세요");
		name=sc.nextLine();
		ss.setName(name);
		objArray(ss);
	}

	public void insertAge() {
		// TODO Auto-generated method stub
		System.out.println("나이을 입력하세요");
		age=sc.nextInt();
		ss.setAge(age);
		objArray(ss);
		
	}

	public void insertGender() {
		// TODO Auto-generated method stub
		System.out.println("성별을 입력하세요(F/M)");
		gender=sc.next().charAt(0);
		ss.setGender(gender);
		objArray(ss);
		
		
	}

	public void objArray(Student ss) {
		s[objectNum]=ss;
		
	}

	public int getObjectNum() {
		return objectNum;
	}

	public void setObjectNum(int objectNum) {
		this.objectNum = objectNum;
	}

	public void outter() {
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i].getName()+s[i].getAge()+s[i].getGender());
		}
		
	}
	


}
