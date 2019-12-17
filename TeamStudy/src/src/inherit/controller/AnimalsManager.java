package src.inherit.controller;

import java.util.Scanner;

import src.inherit.model.vo.Animals;
import src.inherit.model.vo.Cat;
import src.inherit.model.vo.Dog;
import src.inherit.model.vo.Hamster;

public class AnimalsManager {

	Scanner sc=new Scanner(System.in);
	Animals c=new Cat();
	Animals d=new Dog();
	Animals h=new Hamster();
	//
	public void CatChoice() {
		System.out.println("1.울음소리듣기");
		System.out.println("2.달리는 소리 듣기");
		System.out.println("3.수면시간");
		System.out.println("번호를 입력하세요");
		int num=sc.nextInt();
		switch(num) {
		case 1: System.out.println(((Cat)c).cry());break;
		case 2:System.out.println(((Cat)c).run());break;
		case 3:System.out.println(((Cat)c).sleepTime());break;
		
		}
	}
	public void DogChoice() {
		System.out.println("1.울음소리듣기");
		System.out.println("2.달리는 소리 듣기");
		System.out.println("3.수면시간");
		System.out.println("번호를 입력하세요");
		int num=sc.nextInt();
		switch(num) {
		case 1:System.out.println( ((Dog)d).cry());break;
		case 2:System.out.println(((Dog)d).run());break;
		case 3:System.out.println(((Dog)d).sleepTime());break;
	}
}
	public void HamsterChoice() {
		System.out.println("1.울음소리듣기");
		System.out.println("2.달리는 소리 듣기");
		System.out.println("3.수면시간");
		System.out.println("번호를 입력하세요");
		int num=sc.nextInt();
		switch(num) {
		case 1: System.out.println(((Hamster)h).cry());break;
		case 2:System.out.println(((Hamster)h).run());break;
		case 3:System.out.println(((Hamster)h).sleepTime());break;
		}
	}
	
	
}
