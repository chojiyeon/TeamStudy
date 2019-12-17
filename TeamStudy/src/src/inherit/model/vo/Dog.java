package src.inherit.model.vo;

public class Dog extends Animals {
	
	private String name;
	private int legs;
	private int tail;
	private String cry;
	
	public Dog() {};
	public Dog(String name,int legs,int tail) {
		super(name, legs);
		this.tail=tail;
	};

	public String cry() {
		cry="¸Û¸Û";
		return cry;
	}
	public String run() {
		return "¸Û´Ù´Ú";
	}
	public int sleepTime() {
		return 13;
	}

}
