package chap04; //Ű����� while �� ����

public class ForMultiplicationTableExample {

	public static void main(String[] args) throws Exception {
		// throws Exception => System.in.read(); ����ó��
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) { //Enter Ű �� ����
				System.out.println("----------------------------");
				System.out.println("1. ���� | 2. ���� | 3. ���� ");
				System.out.println("----------------------------");
				System.out.println("��ȣ ���� : ");
			}
			//Ű������ Ű�� ����
			keyCode = System.in.read();		
			
		if(keyCode == 49) { //1�� �о��� ��� (1�� keyCode = 49)
			speed++;
			System.out.println("���� �ӵ� = "+speed);
			
		} else if (keyCode == 50) { //2�� �о��� ���
			speed--;
			System.out.println("���� �ӵ� = "+speed);
			
		} else if (keyCode == 51) {	//3�� �о��� ���
			run = false; //while ���Ḧ ���� false ��
		
		}
			
				}//while
		
		System.out.println("���α׷� ����");
		
		
		
	}

}
