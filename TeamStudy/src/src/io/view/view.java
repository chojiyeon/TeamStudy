package src.io.view;

import java.util.Scanner;

import src.io.controller.StudentManager;
import src.io.model.dao.StudentDao;


public class view {

	
	public void start() {
		// TODO Auto-generated method stub
		boolean bl=true;
		Scanner sc=new Scanner(System.in);
		StudentDao sd=new StudentDao();
		StudentManager sm=new StudentManager();
		do {
		System.out.println("=============�޴�=============");
		System.out.println("1.�л��� �Է��ϱ�");
		System.out.println("2.�л��̸����� ��ȸ�ϱ�");
		System.out.println("3.�л���ȣ�� ��ȸ�ϱ�");
		System.out.println("4.�����ϱ�");
		System.out.println("��ȣ�Է��ϼ���");
		int num=sc.nextInt();
		switch(num) {
		case 1: sm.insertStudent(sm.inputStudent());break;
		case 2:	sm.searchName();break;
		case 3:	sm.searchNum();break;
		case 4:	bl=false;return;//return���� ����Ǵ��� Ȯ���غ���
		}
		
		}while(bl);
	}
	
	

}
