package src.miniProject_Indi.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import src.miniProject_Indi.model.vo.Gathering;

public class GatheringDao {

	ArrayList<Gathering> gal=new ArrayList<Gathering>();
	
	public ArrayList<Gathering> fileRead(){
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("Gathering.dat"));
			gal=(ArrayList<Gathering>)ois.readObject();
		} catch (ClassNotFoundException|FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return gal;
	}
	
	
	public void fileWrite(ArrayList<Gathering> gal) {
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream("Gathering.dat"));
			oos.writeObject(gal);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
