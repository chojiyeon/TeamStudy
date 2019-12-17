package src.collection.model.vo;

import java.io.Serializable;

public class Apple extends Fruits implements Serializable{

	public Apple() {}
	public Apple(String name, int amount,int price) {
		super(name, amount,price);
	}
	
}
