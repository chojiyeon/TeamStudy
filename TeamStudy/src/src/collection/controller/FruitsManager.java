package src.collection.controller;

import java.util.HashMap;
import java.util.Scanner;

import src.collection.model.dao.FruitsDao;
import src.collection.model.vo.Apple;
import src.collection.model.vo.Fruits;
import src.collection.model.vo.Grape;
import src.collection.model.vo.Orange;

public class FruitsManager {
	public HashMap<String,Fruits> hm=new HashMap<String,Fruits>();
	public Fruits farr[]=new Fruits[4];
	public Fruits f=new Fruits();
	Scanner sc=new Scanner(System.in);
	public FruitsDao fd=new FruitsDao();
	public Fruits[] inputFrutis() {//�ٿ�ĳ������ ���ϰ���!!!!!!!!!!!!!!!
		//�θ�Ŭ���� ��ü�迭�� �����ϰ� �ű⿡ �ڽİ�ü���־���
		//ex>Frutis[] farr=new Frutis[]; farr[1]=new Apple();farr[2]=new Grape()
		// TODO Auto-generated method stub
		farr[0]= new Apple();
		farr[1]= new Orange();
		farr[2]= new Grape();
		System.out.println("�����̸��� �Է��ϼ���(3�� 1��:���,������,����)");
		String name=sc.nextLine();
		f.setName(name);
		if(f.getName().equals("���")) {
			farr[0].setName(f.getName());
			System.out.println("������ �Է��ϼ���");
			int amount=sc.nextInt();
			farr[0].setAmount(amount);
			System.out.println("������ �Է��ϼ���");
			int price=sc.nextInt();
			farr[0].setPrice(price);
		}else if(f.getName().equals("������")) {
			farr[1].setName(f.getName());
			System.out.println("������ �Է��ϼ���");
			int amount=sc.nextInt();
			farr[1].setAmount(amount);
			System.out.println("������ �Է��ϼ���");
			int price=sc.nextInt();
			farr[1].setPrice(price);
		}else if(f.getName().equals("����")) {
			farr[2].setName(f.getName());
			System.out.println("������ �Է��ϼ���");
			int amount=sc.nextInt();
			farr[2].setAmount(amount);
			System.out.println("������ �Է��ϼ���");
			int price=sc.nextInt();
			farr[2].setPrice(price);
		}
		return farr;
	}

	public void insertFruits(Fruits[] farr) {
		// TODO hashMap�� �ֱ�,���Ͽ� �ֱ�
		for(int i=0;i<farr.length;i++) {//hashMap�� ��ü�� ����
			if(i==0) {
				hm.put("���", farr[0]);
			}else if(i==1) {
				hm.put("������", farr[1]);
			}else if(i==2) {
				hm.put("����", farr[2]);
			}
		}
	 //Iterator fIter=hm.keySet().iterator();
	 
		//while(fIter.hasNext()) {
			
		//}
		fd.writeFile(hm);
		
		
	}

	public void plusFruits() {
		// TODO Auto-generated method stub
		Scanner scc=new Scanner(System.in);
		hm=fd.readFlie();
		System.out.println("�԰��� ���� ���� ���ÿ�(3�� ��1: ���,������,����)");
		String name=scc.nextLine();
		if(hm.get(name).getName().equals("���")) {
			System.out.println("�԰��� ��� ������ ���ÿ�");
			int amount=sc.nextInt();
			farr[0].setAmount(farr[0].getAmount()+amount);
			insertFruits(farr);
		}else if(hm.get(name).getName().equals("������")) {
			System.out.println("�԰��� ������ ������ ���ÿ�");
			int amount=sc.nextInt();
			farr[1].setAmount(farr[1].getAmount()+amount);
			insertFruits(farr);
		}else if(hm.get(name).getName().equals("����")) {
			System.out.println("�԰��� ���� ������ ���ÿ�");
			int amount=sc.nextInt();
			farr[2].setAmount(farr[2].getAmount()+amount);
			insertFruits(farr);
		}
		//fd.writeFile(hm);
	}

	public void minusFruits() {
		// TODO Auto-generated method stub
		Scanner scc=new Scanner(System.in);
		hm=fd.readFlie();
		System.out.println("����� ���� ���� ���ÿ�(3�� ��1: ���,������,����)");
		String name=scc.nextLine();
		if(hm.get(name).getName().equals("���")) {
			System.out.println("����� ��� ������ ���ÿ�");
			int amount=sc.nextInt();
			if(farr[0].getAmount()<amount) {
				System.out.println("��� �����մϴ�.");
			}else {
			farr[0].setAmount(farr[0].getAmount()-amount);
			insertFruits(farr);
			}
		}else if(hm.get(name).getName().equals("������")) {
			System.out.println("����� ������ ������ ���ÿ�");
			int amount=sc.nextInt();
			if(farr[1].getAmount()<amount) {
				System.out.println("��� �����մϴ�.");
			}else {
			farr[1].setAmount(farr[1].getAmount()-amount);
			insertFruits(farr);
			}
		}else if(hm.get(name).getName().equals("����")) {
			System.out.println("����� ���� ������ ���ÿ�");
			int amount=sc.nextInt();
			if(farr[2].getAmount()<amount) {
				System.out.println("��� �����մϴ�.");
			}else {
			farr[2].setAmount(farr[2].getAmount()-amount);
			insertFruits(farr);
			}
		}
		fd.writeFile(hm);
		
	}

	public void search() {
		// TODO Auto-generated method stub
		System.out.println(fd.readFlie());
		
	}

}
