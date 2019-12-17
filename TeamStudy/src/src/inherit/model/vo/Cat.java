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
		cry="�߿�";
		return cry;
	}
	public String run() {
		return "�ɴٴ�";
	}
	public int sleepTime() {
		return 18;
	}
}
