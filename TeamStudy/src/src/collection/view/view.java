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
			System.out.println("=========메뉴==========");
			System.out.println("1.과일 입력하기");
			System.out.println("2.과일 입고");
			System.out.println("3.과일 출고");
			System.out.println("4.재고현황보기");
			System.out.println("5.종료");
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
