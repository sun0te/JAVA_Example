package exam02_Class_Inheritance;	//�ڽ� Ŭ����

public class DmbCellPhone extends CellPhone {
	//�ʵ�
	int channel;
	
	//������
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;	//CellPhone ���κ��� ��ӹ��� �ʵ�
		this.color = color; //CellPhone ���κ��� ��ӹ��� �ʵ�
		this.channel = channel;
	}
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�. ");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�. ");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�. ");
	}
	
}
