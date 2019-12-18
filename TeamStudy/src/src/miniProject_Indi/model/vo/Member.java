package src.miniProject_Indi.model.vo;

import java.util.ArrayList;

public class Member {

	private String id;
	private String pw;
	private String name;
	private ArrayList interest;
	private String email;
	public Member() {}
	public Member(String id, String pw, String name, ArrayList interest,String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.interest = interest;
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList getInterest() {
		return interest;
	}
	public void setInterest(ArrayList interest) {
		this.interest = interest;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", interest=" + interest + ", email=" + email
				+ "]";
	}
	
	
	
}
