package src.io.view;

import java.util.Scanner;

import src.io.controller.StudentManager;
import src.io.model.dao.StudentDao;


public class view {

	
	public void start() {
		// TODO Auto-generated method stub
		boolean bl=true;
		Scanner sc=new Scanner(System.in);
		StudentDao sd=new StudentDao();
		StudentManager sm=new StudentManager();
		do {
		System.out.println("=============메뉴=============");
		System.out.println("1.학생을 입력하기");
		System.out.println("2.학생이름으로 조회하기");
		System.out.println("3.학생번호로 조회하기");
		System.out.println("4.종료하기");
		System.out.println("번호입력하세요");
		int num=sc.nextInt();
		switch(num) {
		case 1: sm.insertStudent(sm.inputStudent());break;
		case 2:	sm.searchName();break;
		case 3:	sm.searchNum();break;
		case 4:	bl=false;return;//return으로 종료되는지 확인해보기
		}
		
		}while(bl);
	}
	
	

}
