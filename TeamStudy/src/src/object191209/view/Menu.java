package src.object191209.view;

import java.util.Scanner;

import src.object191209.controller.StudentManager;

public class Menu {

	public void MeunStart() {
		StudentManager sm=new StudentManager();
		boolean stop=true;
		int i=0;

		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("----------학생정보를 입력하세요-----------");
			System.out.println("1.이름 입력하기");
			System.out.println("2.나이 입력하기");
			System.out.println("3.성별 입력하기");
			System.out.println("4.종료");
			System.out.println("5.객체정보 출력");
			System.out.println("번호를 입력하세요");
			int num=sc.nextInt();

			switch(num) {
			case 1: sm.insertName(); break;
			case 2: sm.insertAge(); break;
			case 3: sm.insertGender(); break;
			case 4: stop=false; break;
			case 5: sm.outter();break;
			}

		sm.setObjectNum(i);
		i++;
		}while(stop);
	}
	
	
	
	
	
}
