package com.kh.teamStudy;

import java.util.Random;
import java.util.Scanner;

public class Study {

	public void studyTest() {
		//���� ���߱�
		Scanner sc=new Scanner(System.in);

		int num=0;
		int random=new Random().nextInt(15)+1;
		System.out.println("Random"+random);

		for(int i=1;i<4;i++) {
			System.out.println("���� ������ �Է��ϼ���(1~15) 3ȸ����:");
			num=sc.nextInt();
			if(num==random) {
				System.out.println("������ϴ�.");
				break;
			}else {
				System.out.println(i+"ȸ �õ�"+"Ʋ�Ƚ��ϴ�.");
			}
			
		}System.out.println("������"+random+"(��)�����ϴ�.");


	}
	public void ParkEunSeok() {
		// 10 ������ �ڿ����� �Է��ϰ� �Էµ� �� ��ŭ�� '*'�� ������ �ٰ� ĭ�� ���.
		// ��, ���� �Ѿ������ ĭ�� ���� �ϳ��� �پ���.
		// ���ڰ� ���ǿ� �ȸ´� ��� ��10 ������ �ڿ�����!�� ������ ������ ����ϰ� ����.
		// �Է�: 3
		// ���:
		// ***
		// **
		// *
		Scanner sc=new Scanner(System.in);
		System.out.println("10������ �ڿ����� �Է��ϼ���");
		int num=sc.nextInt();
		if(num<=10) {
			for(int i=num;i>=1;i--) {
				for(int j=num;j>=1;j--) {
					System.out.print('*');
				}
				num--;
				System.out.println();
			}

		}else {System.out.println("10������ �ڿ�����!");
		}
	}
	public void SeoJinHeuk() {
		/*1���� 100������ ������ �ι� �������� 
		���������� ū�������� ������ ���ϼ���*/
	int random=new Random().nextInt(100)+1;
	int random1=new Random().nextInt(100)+1;
	int max=0,min=0;
	int sum=0;
	System.out.println("�� ��������"+random+"��"+random1+"�Դϴ�.");
	if(random>random1) {
		max=random;
		min=random1;
	}else if(random1>random) {
		max=random1;
		min=random;
	}else {
		System.out.println("�� ���� ���� �����ϴ�.");
	}
	for(int i=min;i<=max;i++) {
		sum+=i;
	}
	System.out.println(min+"���� "+max+"���� �� ����"+sum);
	
	
	
	
	}
	public void ParkJongChul() {
		/*���������� �Է¹޾� Ȧ�� ¦���� ǥ�����ּ��� .
		��, ���� ������ �ƴ� ���� �Է� ������� ����ؼ� �Է��� ��û�ϼ���
		���������� �Է� �� �Ŀ� �޼ҵ尡 ����Ǵ��� Ȯ�����ּ���*/
		Scanner sc=new Scanner(System.in);
		//System.out.println("���� ������ �Է��ϼ���");
		//int num=sc.nextInt();
		//if(num>0) {
			/*for(;num<0;) {
				System.out.println("�ٽ��Է��ϼ���");
				num=sc.nextInt();*/
		//}
		for(;true;) {
			System.out.println("���� ������ �Է��ϼ���");
			int num=sc.nextInt();
			if(num>0){
				if(num%2==0) {
					System.out.println("�Է��Ͻ� ���� ������ ¦���Դϴ�.");
				}else {
					System.out.println("�Է��Ͻ� ���� ������ Ȧ���Դϴ�.");
				} break;
			}else {
				for(;num<0;) {
					System.out.println("�ٽ��Է��ϼ���");
					num=sc.nextInt();
				}	
			}
		}	
	}
	public void KimSeongJun() {
		/*�귿����
		 * 1~777�� ������ �Է¹ް� ���� Ƚ���� �Է¹޴´� �׸��� for������ ����Ͽ�
		 * ������ �Է��ϰ� ������ �� ȸ������ ������ �Է��� ������ ������ ������ ������
		 * ��÷ �ƴϸ� ������ ��÷���θ� Ȯ�δ�. 
		 * */
		Scanner sc=new Scanner(System.in);
		System.out.println("Ƚ���� �Է��ϼ���");
		int count=sc.nextInt();
		System.out.println("������� �Է��ϼ���");
		int num=sc.nextInt();
		for(int i=1;i<=count;i++) {
			int random=new Random().nextInt(777)+1;
			if(num==random) {
				System.out.println("��÷");
				break;
			}else {
				System.out.println("��");
				System.out.println("������"+random+"�� �����ϴ�.");
			}
			
		}
		//System.out.println("������"+random+"�� �����ϴ�.");
		
	}




	
}
