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
			 throw new Myexception(p.getName()+"은(는) 나이 제한에 걸려서 시청불가입니다.");
		 }else {
			 System.out.println(p.getName()+"님 즐겁게 감상하세요");
		 }
	 }
}
