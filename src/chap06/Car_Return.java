package chap06;	//return

public class Car_Return {
	
	//�ʵ�
	int gas;
	
	//������
	
	//�޼ҵ�
	void setGas(int gas) {	//return ���� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ尪�� ����
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�. ");
			return false;	//���ϰ��� boolean�� �޼ҵ�� gas�ʵ尪�� 0�� false return
		}
		System.out.println("gas�� �ֽ��ϴ�. ");
		return true;	//true return
	}
	
	void run() {	//���ϰ��� ���� �޼ҵ�� gas �ʵ尪�� 0�̸� return ������ �޼ҵ� ���� ����
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas�ܷ� : "+gas+")");
				gas -= 1;;
			}
			else {
				System.out.println("����ϴ�. (gas�ܷ� : "+gas+")");
				return;	//�޼ҵ� ���� ����
			}
		}
	}
	
	
}
