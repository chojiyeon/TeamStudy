package src.inherit.model.vo;

public class Hamster extends Animals {
	private String name;
	private int legs;
	private int cheekPouchSize;
	private String cry;
	
	public Hamster() {};
	public Hamster(String name,int legs,int cheekPouchSize) {
		super(name, legs);
		this.cheekPouchSize=cheekPouchSize;
	};

	public String cry() {
		cry="ÂïÂï";
		return cry;
	}
	public String run() {
		return "Áã´Ù´Ú";
	}
	public int sleepTime() {
		return 20;
	}
	
}
