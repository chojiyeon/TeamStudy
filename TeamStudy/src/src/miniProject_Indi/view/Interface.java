package src.miniProject_Indi.view;

import java.util.Scanner;

public class Interface {

	
	public void startPage() {
		// TODO Auto-generated method stub
		LogIn li=new LogIn();
		SignUp su=new SignUp();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("===========����ȭ��============");
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.���̵�/��й�ȣ ã��");
			System.out.println("9.����");
			System.out.println("��ȣ�� �Է��ϼ���");
			int num=sc.nextInt();
			
			switch(num) {
			case 1:li.login();break;
			case 2:su.signup();break;
			case 3:li.searchLog();break;
			case 9:return;
			}
			
			
		}
		
		
		
		
	}

}
