package src.miniProject_Indi.view;

import java.util.ArrayList;
import java.util.Scanner;

import src.miniProject_Indi.model.dao.MemberDao;
import src.miniProject_Indi.model.vo.Member;

public class SignUp {
	
	ArrayList<Member> mal=null;
	public ArrayList<Member> signup() {
		// TODO 아이디중복값확인,
		Scanner sc=new Scanner(System.in);
		MemberDao md=new MemberDao();
		Member m=new Member();//회원객체
		
		//아이디
		System.out.println("사용하실 id를 입력하세요");
		String id=sc.nextLine();
		if(mal==null) {
			mal=new ArrayList<Member>();
		}
		mal=md.fileRead();
		while(true) {//아이디 중복값 확인하려는 반복문
			int checkUni=0;//중복이 됐었는지 확인하는 변수
			for(int i=0;i<mal.size();i++) {
				if(mal.get(i).getId().equals(id)) {
					System.out.println("아이디가 중복되었습니다. 다시 입력하세요");
					id=sc.nextLine();
					checkUni++;
					continue;
				}
			}
			if(checkUni==0) {//중복이 안됐으면 반복문 탈출
				break;
			}
		}
		
		//비밀번호
		String pw=null;
		String checkpw=null;
		while(true) {//비밀번호
			int equalpw=0;//비밀번호 일치하는 지 확인
			System.out.println("비밀번호를 입력하세요");
			pw=sc.nextLine();
			System.out.println("비밀번호 확인");
			checkpw=sc.nextLine();
			if(!pw.equals(checkpw)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시입력하세요");
				equalpw++;//일치하지 않으면 숫자증가
			}
			if(equalpw==0) {
				break;
			}
		}
		
		//이름
		System.out.println("이름을 입력하세요");
		String name=sc.nextLine();
		
		//관심사
		System.out.println("관심사를 입력하세요(exit를 누르면 관심사 등록 중지)");
		ArrayList interAl=null;
		while(true) {//여러 관심사를 받기위한 반복문
			String str=sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			interAl.add(str);
			
		}
	
		//이메일
		System.out.println("이메일을 입력하세요");
		String email=sc.nextLine();
		
		//객체에 입력받은 값들 저장
		
		m.setId(id);
		m.setPw(checkpw);
		m.setName(name);
		m.setInterest(interAl);
		m.setEmail(email);
		mal.add(m);//회원 ArrayList mal에  회원객체 저장
		return mal;//ㅎ
		
	}

}
