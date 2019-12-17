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
	public Fruits[] inputFrutis() {//다운캐스팅을 못하겠음!!!!!!!!!!!!!!!
		//부모클래스 객체배열을 생성하고 거기에 자식객체를넣어줌
		//ex>Frutis[] farr=new Frutis[]; farr[1]=new Apple();farr[2]=new Grape()
		// TODO Auto-generated method stub
		farr[0]= new Apple();
		farr[1]= new Orange();
		farr[2]= new Grape();
		System.out.println("과일이름을 입력하세요(3중 1개:사과,오렌지,포도)");
		String name=sc.nextLine();
		f.setName(name);
		if(f.getName().equals("사과")) {
			farr[0].setName(f.getName());
			System.out.println("수량을 입력하세요");
			int amount=sc.nextInt();
			farr[0].setAmount(amount);
			System.out.println("가격을 입력하세요");
			int price=sc.nextInt();
			farr[0].setPrice(price);
		}else if(f.getName().equals("오렌지")) {
			farr[1].setName(f.getName());
			System.out.println("수량을 입력하세요");
			int amount=sc.nextInt();
			farr[1].setAmount(amount);
			System.out.println("가격을 입력하세요");
			int price=sc.nextInt();
			farr[1].setPrice(price);
		}else if(f.getName().equals("포도")) {
			farr[2].setName(f.getName());
			System.out.println("수량을 입력하세요");
			int amount=sc.nextInt();
			farr[2].setAmount(amount);
			System.out.println("가격을 입력하세요");
			int price=sc.nextInt();
			farr[2].setPrice(price);
		}
		return farr;
	}

	public void insertFruits(Fruits[] farr) {
		// TODO hashMap에 넣기,파일에 넣기
		for(int i=0;i<farr.length;i++) {//hashMap에 객체를 넣음
			if(i==0) {
				hm.put("사과", farr[0]);
			}else if(i==1) {
				hm.put("오렌지", farr[1]);
			}else if(i==2) {
				hm.put("포도", farr[2]);
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
		System.out.println("입고할 과일 명을 쓰시오(3중 택1: 사과,오렌지,포도)");
		String name=scc.nextLine();
		if(hm.get(name).getName().equals("사과")) {
			System.out.println("입고할 사과 수량을 쓰시오");
			int amount=sc.nextInt();
			farr[0].setAmount(farr[0].getAmount()+amount);
			insertFruits(farr);
		}else if(hm.get(name).getName().equals("오렌지")) {
			System.out.println("입고할 오렌지 수량을 쓰시오");
			int amount=sc.nextInt();
			farr[1].setAmount(farr[1].getAmount()+amount);
			insertFruits(farr);
		}else if(hm.get(name).getName().equals("포도")) {
			System.out.println("입고할 포도 수량을 쓰시오");
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
		System.out.println("출고할 과일 명을 쓰시오(3중 택1: 사과,오렌지,포도)");
		String name=scc.nextLine();
		if(hm.get(name).getName().equals("사과")) {
			System.out.println("출고할 사과 수량을 쓰시오");
			int amount=sc.nextInt();
			if(farr[0].getAmount()<amount) {
				System.out.println("재고가 부족합니다.");
			}else {
			farr[0].setAmount(farr[0].getAmount()-amount);
			insertFruits(farr);
			}
		}else if(hm.get(name).getName().equals("오렌지")) {
			System.out.println("출고할 오렌지 수량을 쓰시오");
			int amount=sc.nextInt();
			if(farr[1].getAmount()<amount) {
				System.out.println("재고가 부족합니다.");
			}else {
			farr[1].setAmount(farr[1].getAmount()-amount);
			insertFruits(farr);
			}
		}else if(hm.get(name).getName().equals("포도")) {
			System.out.println("출고할 포도 수량을 쓰시오");
			int amount=sc.nextInt();
			if(farr[2].getAmount()<amount) {
				System.out.println("재고가 부족합니다.");
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
