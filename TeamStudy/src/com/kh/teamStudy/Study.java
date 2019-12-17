package com.kh.teamStudy;

import java.util.Random;
import java.util.Scanner;

public class Study {

	public void studyTest() {
		//숫자 맞추기
		Scanner sc=new Scanner(System.in);

		int num=0;
		int random=new Random().nextInt(15)+1;
		System.out.println("Random"+random);

		for(int i=1;i<4;i++) {
			System.out.println("난수 예상값을 입력하세요(1~15) 3회제한:");
			num=sc.nextInt();
			if(num==random) {
				System.out.println("맞췄습니다.");
				break;
			}else {
				System.out.println(i+"회 시도"+"틀렸습니다.");
			}
			
		}System.out.println("난수는"+random+"(이)였습니다.");


	}
	public void ParkEunSeok() {
		// 10 이하의 자연수를 입력하고 입력된 수 만큼의 '*'로 구성된 줄과 칸을 출력.
		// 단, 한줄 넘어갈때마다 칸의 수는 하나씩 줄어든다.
		// 숫자가 조건에 안맞는 경우 “10 이하의 자연수만!” 따위의 문구를 출력하고 종료.
		// 입력: 3
		// 출력:
		// ***
		// **
		// *
		Scanner sc=new Scanner(System.in);
		System.out.println("10이하의 자연수를 입력하세요");
		int num=sc.nextInt();
		if(num<=10) {
			for(int i=num;i>=1;i--) {
				for(int j=num;j>=1;j--) {
					System.out.print('*');
				}
				num--;
				System.out.println();
			}

		}else {System.out.println("10이하의 자연수만!");
		}
	}
	public void SeoJinHeuk() {
		/*1부터 100사이의 난수를 두번 뽑은다음 
		작은수에서 큰수까지의 총합을 구하세여*/
	int random=new Random().nextInt(100)+1;
	int random1=new Random().nextInt(100)+1;
	int max=0,min=0;
	int sum=0;
	System.out.println("두 난수값은"+random+"과"+random1+"입니다.");
	if(random>random1) {
		max=random;
		min=random1;
	}else if(random1>random) {
		max=random1;
		min=random;
	}else {
		System.out.println("두 난수 값이 같습니다.");
	}
	for(int i=min;i<=max;i++) {
		sum+=i;
	}
	System.out.println(min+"부터 "+max+"까지 의 합은"+sum);
	
	
	
	
	}
	public void ParkJongChul() {
		/*양의정수를 입력받아 홀수 짝수를 표현해주세요 .
		단, 양의 정수가 아닌 값을 입력 받을경우 계속해서 입력을 요청하세요
		양의정수를 입력 한 후에 메소드가 종료되는지 확인해주세요*/
		Scanner sc=new Scanner(System.in);
		//System.out.println("양의 정수를 입력하세요");
		//int num=sc.nextInt();
		//if(num>0) {
			/*for(;num<0;) {
				System.out.println("다시입력하세요");
				num=sc.nextInt();*/
		//}
		for(;true;) {
			System.out.println("양의 정수를 입력하세요");
			int num=sc.nextInt();
			if(num>0){
				if(num%2==0) {
					System.out.println("입력하신 양의 정수는 짝수입니다.");
				}else {
					System.out.println("입력하신 양의 정수는 홀수입니다.");
				} break;
			}else {
				for(;num<0;) {
					System.out.println("다시입력하세요");
					num=sc.nextInt();
				}	
			}
		}	
	}
	public void KimSeongJun() {
		/*룰렛게임
		 * 1~777의 정수를 입력받고 돌릴 횟수를 입력받는다 그리고 for구문을 사용하여
		 * 난수를 입력하고 돌리는 각 회차마다 본인이 입력한 정수와 난수가 같은지 같으면
		 * 당첨 아니면 꽝으로 당첨여부를 확인다. 
		 * */
		Scanner sc=new Scanner(System.in);
		System.out.println("횟수를 입력하세요");
		int count=sc.nextInt();
		System.out.println("예상수를 입력하세요");
		int num=sc.nextInt();
		for(int i=1;i<=count;i++) {
			int random=new Random().nextInt(777)+1;
			if(num==random) {
				System.out.println("당첨");
				break;
			}else {
				System.out.println("꽝");
				System.out.println("난수는"+random+"이 였습니다.");
			}
			
		}
		//System.out.println("난수는"+random+"이 였습니다.");
		
	}




	
}
