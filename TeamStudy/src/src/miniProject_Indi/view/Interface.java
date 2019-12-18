package src.miniProject_Indi.view;

import java.util.Scanner;

public class Interface {

	
	public void startPage() {
		// TODO Auto-generated method stub
		LogIn li=new LogIn();
		SignUp su=new SignUp();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("===========메인화면============");
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.아이디/비밀번호 찾기");
			System.out.println("9.종료");
			System.out.println("번호를 입력하세요");
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
