package src.inherit.model.vo;

public class Cat extends Animals{
	
	private String name;
	private int legs;
	private int groomingCount;
	private String cry;
	
	public Cat() {};
	public Cat(String name,int legs,int groomingCount) {
		super(name, legs);
		this.groomingCount=groomingCount;
	};

	public String cry() {
		cry="¾ß¿Ë";
		return cry;
	}
	public String run() {
		return "³É´Ù´Ú";
	}
	public int sleepTime() {
		return 18;
	}
}
