package src.miniProject_Indi.view;

import java.util.ArrayList;
import java.util.Scanner;

import src.miniProject_Indi.model.dao.MemberDao;
import src.miniProject_Indi.model.vo.Member;

public class SignUp {
	
	ArrayList<Member> mal=null;
	public ArrayList<Member> signup() {
		// TODO ���̵��ߺ���Ȯ��,
		Scanner sc=new Scanner(System.in);
		MemberDao md=new MemberDao();
		Member m=new Member();//ȸ����ü
		
		//���̵�
		System.out.println("����Ͻ� id�� �Է��ϼ���");
		String id=sc.nextLine();
		if(mal==null) {
			mal=new ArrayList<Member>();
		}
		mal=md.fileRead();
		while(true) {//���̵� �ߺ��� Ȯ���Ϸ��� �ݺ���
			int checkUni=0;//�ߺ��� �ƾ����� Ȯ���ϴ� ����
			for(int i=0;i<mal.size();i++) {
				if(mal.get(i).getId().equals(id)) {
					System.out.println("���̵� �ߺ��Ǿ����ϴ�. �ٽ� �Է��ϼ���");
					id=sc.nextLine();
					checkUni++;
					continue;
				}
			}
			if(checkUni==0) {//�ߺ��� �ȵ����� �ݺ��� Ż��
				break;
			}
		}
		
		//��й�ȣ
		String pw=null;
		String checkpw=null;
		while(true) {//��й�ȣ
			int equalpw=0;//��й�ȣ ��ġ�ϴ� �� Ȯ��
			System.out.println("��й�ȣ�� �Է��ϼ���");
			pw=sc.nextLine();
			System.out.println("��й�ȣ Ȯ��");
			checkpw=sc.nextLine();
			if(!pw.equals(checkpw)) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ��Է��ϼ���");
				equalpw++;//��ġ���� ������ ��������
			}
			if(equalpw==0) {
				break;
			}
		}
		
		//�̸�
		System.out.println("�̸��� �Է��ϼ���");
		String name=sc.nextLine();
		
		//���ɻ�
		System.out.println("���ɻ縦 �Է��ϼ���(exit�� ������ ���ɻ� ��� ����)");
		ArrayList interAl=null;
		while(true) {//���� ���ɻ縦 �ޱ����� �ݺ���
			String str=sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			interAl.add(str);
			
		}
	
		//�̸���
		System.out.println("�̸����� �Է��ϼ���");
		String email=sc.nextLine();
		
		//��ü�� �Է¹��� ���� ����
		
		m.setId(id);
		m.setPw(checkpw);
		m.setName(name);
		m.setInterest(interAl);
		m.setEmail(email);
		mal.add(m);//ȸ�� ArrayList mal��  ȸ����ü ����
		return mal;//��
		
	}

}
