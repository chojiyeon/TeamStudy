package src.inherit.view;

import java.util.Scanner;

import src.inherit.controller.AnimalsManager;

public class View {

	public void animalsStart() {
		Scanner sc=new Scanner(System.in);
		boolean bl=true;
		AnimalsManager am=new AnimalsManager();
		
		
		do {
		System.out.println("======동물선택=====");
		System.out.println("1.개");
		System.out.println("2.고양이");
		System.out.println("3.햄스터");
		System.out.println("4.종료");
		System.out.println("번호를 입력하세요");
		int num=sc.nextInt();
		//VIEW->ANIMALSMANAGER클래스에 메소드 동일하게 CHOICE()를 만들고 CHOICE(ANIMALS A)를 받게 한후 
		//IF(A INSTENCEOF C(NEW CAT()))식으로 개랑 햄스터로 나눠서 각 객체의 메소드가 실행될수 있도록 수정 
		switch(num) {
		case 1: am.DogChoice();break;
		case 2: am.CatChoice();break;
		case 3: am.HamsterChoice();break;
		case 4: bl=false;break;
		}
		}while(bl);
		
	}
	
	
}
