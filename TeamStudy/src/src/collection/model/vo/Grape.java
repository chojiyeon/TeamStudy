package src.collection.model.vo;

import java.io.Serializable;

public class Grape extends Fruits implements Serializable{

	public Grape() {}
	public Grape(String name, int amount,int price) {
		super(name, amount,price);
	}
	
}
