package src.io.controller;

import java.util.ArrayList;
import java.util.Scanner;

import src.io.model.dao.StudentDao;
import src.io.model.vo.Student;

public class StudentManager {
	public ArrayList<Student> list=new ArrayList<Student>();
	StudentDao sd=new StudentDao();
	public Student inputStudent() {//��ü���� �Է��Ϸ��� �޼ҵ�
	
		
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name=sc.nextLine();
		s.setName(name);
		
		System.out.println("���̸� �Է��ϼ���");
		int age=sc.nextInt();
		s.setAge(age);
		
		System.out.println("��ȣ�� �Է��ϼ���");
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
		System.out.println("�̸��� �Է��ϼ���");
		String name=sc.nextLine();
		s.setName(name);
		list.add(s);
		
		
	}
	public void insertAge() {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���");
		int age=sc.nextInt();
		s.setAge(age);
		list.add(s);
		
	}
	public void insertNum() {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("��ȣ�� �Է��ϼ���");
		int num=sc.nextInt();
		s.setNum(num);
		list.add(s);
		
	}*/
	
	public void searchName() {
		Scanner sc=new Scanner(System.in);
		list=sd.readStudentList();
		System.out.println("ã������ �̸��� �Է��ϼ���");
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
		System.out.println("ã������ ��ȣ�� �Է��ϼ���");
		int chNum=sc.nextInt();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getNum()==chNum) {
				System.out.println(list.get(i).toString());
			}
		}
	}
}
