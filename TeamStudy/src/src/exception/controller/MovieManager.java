package src.exception.controller;

import src.exception.model.vo.Person;

public class MovieManager {

	
	public void seeMovie(Person p) {
		try {
			checkAge(p);
		}catch(Myexception e){
			System.out.println(e.getMessage());
		}
	}
	
	 public void checkAge(Person p) throws Myexception {
		 if(p.getAge()<19) {
			 throw new Myexception(p.getName()+"��(��) ���� ���ѿ� �ɷ��� ��û�Ұ��Դϴ�.");
		 }else {
			 System.out.println(p.getName()+"�� ��̰� �����ϼ���");
		 }
	 }
}
