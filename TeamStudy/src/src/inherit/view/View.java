package src.inherit.view;

import java.util.Scanner;

import src.inherit.controller.AnimalsManager;

public class View {

	public void animalsStart() {
		Scanner sc=new Scanner(System.in);
		boolean bl=true;
		AnimalsManager am=new AnimalsManager();
		
		
		do {
		System.out.println("======��������=====");
		System.out.println("1.��");
		System.out.println("2.�����");
		System.out.println("3.�ܽ���");
		System.out.println("4.����");
		System.out.println("��ȣ�� �Է��ϼ���");
		int num=sc.nextInt();
		//VIEW->ANIMALSMANAGERŬ������ �޼ҵ� �����ϰ� CHOICE()�� ����� CHOICE(ANIMALS A)�� �ް� ���� 
		//IF(A INSTENCEOF C(NEW CAT()))������ ���� �ܽ��ͷ� ������ �� ��ü�� �޼ҵ尡 ����ɼ� �ֵ��� ���� 
		switch(num) {
		case 1: am.DogChoice();break;
		case 2: am.CatChoice();break;
		case 3: am.HamsterChoice();break;
		case 4: bl=false;break;
		}
		}while(bl);
		
	}
	
	
}
