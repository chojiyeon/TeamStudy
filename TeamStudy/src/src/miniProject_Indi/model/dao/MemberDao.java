package src.miniProject_Indi.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import src.miniProject_Indi.model.vo.Member;

public class MemberDao {

	
	ArrayList<Member> mal=new ArrayList<Member>();
	public ArrayList<Member> fileRead(){
		ObjectInputStream ois=null;
		
		try {
			ois=new ObjectInputStream(new FileInputStream("Member.dat"));
				mal=(ArrayList<Member>)ois.readObject();
			
		} catch (ClassNotFoundException|FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return mal;
	}
	
	public void fileWrite(ArrayList<Member> mal) {
		ObjectOutputStream oos=null;
		
		try {
			oos=new ObjectOutputStream(new FileOutputStream("Member.dat"));
			oos.writeObject(mal);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
