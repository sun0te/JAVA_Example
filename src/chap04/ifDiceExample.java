package chap04;	//�ֻ����� ��ȣ�� �̴� ����

public class ifDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6) +1;
		//0.0 ~ 0.1 ������ double Ÿ�� ���� �ϳ��� �����ϱ� ������ int ������ȯ
		// start ���� �����ϴ� n���� ���� �߿��� ������ ���� �ϳ� ����
		// -> int num = (int)(Math.random()*n) + start;
		if(num==1) {
			System.out.println("1���� ���Խ��ϴ�. ");
		} else if(num==2) {
			System.out.println("2���� ���Խ��ϴ�. ");
		} else if(num==3) {
			System.out.println("3���� ���Խ��ϴ�. ");
		} else if(num==4) {
			System.out.println("4���� ���Խ��ϴ�. ");
		} else if(num==5) {
			System.out.println("5���� ���Խ��ϴ�. ");
		} else {
			System.out.println("6���� ���Խ��ϴ�. ");
		}
		
	}

}