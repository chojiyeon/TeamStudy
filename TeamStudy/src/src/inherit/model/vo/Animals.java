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
	//�������̽��� ��ӹ޾������� �������̽� �ȿ� �ִ� �޼ҵ带 ������ �������̵��ؾ���
	//���ϸ� �߻�Ŭ������ ��
	//�ٸ� ���ǵ鿡 ���ؼ� ���� ���Ҷ� return���� ���°� ����
	//���ʿ��� return		return "";
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
