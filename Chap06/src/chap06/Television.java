package chap06;	//���� �ʱ�ȭ ���

public class Television {
	
	//�� ���� ���� �ʵ带 ������ �ִµ�, 
	//company, model �� ���� �� �ʱⰪ�� �־��� info�� �ʱ�ȭ���� �ʾҴ�. 
	//info �ʵ�� ���� ��Ͽ��� company�� model �ʵ尪�� ���� �����ؼ� �ʱⰪ�� �����Ѵ�. 
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}

}
