package src.exception.view;

import src.exception.controller.MovieManager;
import src.exception.model.vo.Person;

public class View {
	public void startEx() {
		Person p[]= {
				new Person("cho",13),
				new Person("kim",20),
				new Person("Jang",26)
		};
		
		System.out.println("��ȭ���������� 19���Դϴ�.");
		MovieManager mm=new MovieManager();
		for(int i=0;i<3;i++) {
			System.out.println(p[i].toString());
			mm.seeMovie(p[i]);
		}
}
}