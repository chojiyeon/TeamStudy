package src.io.controller;

import java.util.ArrayList;
import java.util.Scanner;

import src.io.model.dao.StudentDao;
import src.io.model.vo.Student;

public class StudentManager {
	public ArrayList<Student> list=new ArrayList<Student>();
	StudentDao sd=new StudentDao();
	public Student inputStudent() {//객체값을 입력하려는 메소드
	
		
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name=sc.nextLine();
		s.setName(name);
		
		System.out.println("나이를 입력하세요");
		int age=sc.nextInt();
		s.setAge(age);
		
		System.out.println("번호를 입력하세요");
		int num=sc.nextInt();
		s.setNum(num);
		
		return s;
		
	}
	public void insertStudent(Student s) {
		
		list.add(s);
		sd.writeStudentList(list);
	}
	
	
/*	public void insertName() {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name=sc.nextLine();
		s.setName(name);
		list.add(s);
		
		
	}
	public void insertAge() {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age=sc.nextInt();
		s.setAge(age);
		list.add(s);
		
	}
	public void insertNum() {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("번호를 입력하세요");
		int num=sc.nextInt();
		s.setNum(num);
		list.add(s);
		
	}*/
	
	public void searchName() {
		Scanner sc=new Scanner(System.in);
		list=sd.readStudentList();
		System.out.println("찾으려는 이름을 입력하세요");
		String chName=sc.nextLine();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(chName)) {
				System.out.println(list.get(i).toString());
			}
		}
	}
	public void searchNum() {
		Scanner sc=new Scanner(System.in);
		list=sd.readStudentList();
		System.out.println("찾으려는 번호를 입력하세요");
		int chNum=sc.nextInt();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getNum()==chNum) {
				System.out.println(list.get(i).toString());
			}
		}
	}
}
