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
			System.out.println("----------�л������� �Է��ϼ���-----------");
			System.out.println("1.�̸� �Է��ϱ�");
			System.out.println("2.���� �Է��ϱ�");
			System.out.println("3.���� �Է��ϱ�");
			System.out.println("4.����");
			System.out.println("5.��ü���� ���");
			System.out.println("��ȣ�� �Է��ϼ���");
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
