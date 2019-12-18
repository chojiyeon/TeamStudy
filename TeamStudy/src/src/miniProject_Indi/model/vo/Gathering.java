package src.miniProject_Indi.model.vo;

import java.util.ArrayList;

public class Gathering {

	private String title;
	private ArrayList interTag;
	private String level;
	private String limit;
	private String local;
	public Gathering() {}
	public Gathering(String title, ArrayList interTag, String level, String limit, String local) {
		super();
		this.title = title;
		this.interTag=interTag;
		this.level = level;
		this.limit = limit;
		this.local = local;
	}
	public ArrayList getInterTag() {
		return interTag;
	}
	public void setInterTag(ArrayList interTag) {
		this.interTag = interTag;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	@Override
	public String toString() {
		return "���Ӹ�: " + title +", �±�: "+interTag+ ", ����:" + level + ", �ο�����: " + limit + ", ����: " + local + "]";
	}
}
