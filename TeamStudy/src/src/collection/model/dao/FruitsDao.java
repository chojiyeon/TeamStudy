package src.collection.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import src.collection.model.vo.Fruits;

public class FruitsDao {
	public HashMap<String,Fruits> hm=new HashMap<String,Fruits>();
	public HashMap<String,Fruits> readFlie(){
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("Fruits.dat"));
			
				hm=(HashMap<String, Fruits>) ois.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException|IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return hm;
	} 
	public void writeFile(HashMap<String,Fruits> hm) {
		ObjectOutputStream oos=null;
		
		try {
			oos=new ObjectOutputStream(new FileOutputStream("Fruits.dat"));
			oos.writeObject(hm);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
