package src.inherit.model.vo;

public class Animals implements AnimalsAction {
	private String name;
	private int legs;
	
	public Animals() {}
	public Animals(String name,int legs) {
		this.name=name;
		this.legs=legs;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	//인터페이스를 상속받았음으로 인터페이스 안에 있는 메소드를 무조건 오버라이딩해야함
	//안하면 추상클래스가 됨
	//다른 조건들에 의해서 값이 변할때 return값을 쓰는게 편리함
	//불필요한 return		return "";
	public String cry() {
		return "";
	}
	public String run() {
		return "";
	};
	public int sleepTime() {
		return 0;
	};
	
}
