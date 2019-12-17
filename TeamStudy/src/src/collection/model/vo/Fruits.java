package src.collection.model.vo;

import java.io.Serializable;

public class Fruits implements Serializable{

	private String name;
	private int amount;
	private int price;
	public Fruits() {}
	
	public Fruits(String name, int amount, int price) {
		super();
		this.name = name;
		this.amount = amount;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruits [name=" + name + ", amount=" + amount + ", price=" + price + "]";
	}
	

}
