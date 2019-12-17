package src.io.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import src.io.model.vo.Student;

public class StudentDao {

	public StudentDao() {}
	public ArrayList<Student> readStudentList(){
		ArrayList list=new ArrayList();
		ObjectInputStream oj=null;
		try {
			//파일과 통로생성
			oj=new ObjectInputStream(new FileInputStream("Student.dat"));
			//ArrayList에 넣어줌
			
				list=(ArrayList<Student>)oj.readObject();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 없습니다.");
		} catch (ClassNotFoundException|IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(oj !=null) {
				try {
					oj.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		return list;
	}
	public void writeStudentList(ArrayList<Student> list) {
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream("Student.dat"));
			oos.writeObject(list);
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
