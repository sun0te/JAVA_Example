package chap04;	//char Ÿ���� switch ��

public class SwtichCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'A':	//��ҹ��� ������� �����ϰ� ó��
		case 'a':
			System.out.println("��� ȸ���Դϴ�. ");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�. ");
			break;
			default:
				System.out.println("�մ��Դϴ�. ");
			
		}
	}

}
