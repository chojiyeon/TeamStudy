package src.collection.view;

import java.util.Scanner;

import src.collection.controller.FruitsManager;

public class view {

	public void startView() {
		// TODO Auto-generated method stub
		FruitsManager fm=new FruitsManager();
		boolean bl=true;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("=========�޴�==========");
			System.out.println("1.���� �Է��ϱ�");
			System.out.println("2.���� �԰�");
			System.out.println("3.���� ���");
			System.out.println("4.�����Ȳ����");
			System.out.println("5.����");
			int num=sc.nextInt();
			switch(num) {
			case 1:fm.insertFruits(fm.inputFrutis()); break;
			case 2:fm.plusFruits();break;
			case 3:fm.minusFruits();break;
			case 4:fm.search();break;
			case 5:bl=false;break;
			}
	
		}while(bl);
		
		
		
		
		
		
		
		
	}

}
