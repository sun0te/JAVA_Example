package chap05;	//���� ��ü�� �޼ҵ�

public class EnumMethodExample {

	public static void main(String[] args) {
		//name() method : ���� ��ü�� ������ �ִ� ���ڿ��� ����
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() method : ���� ��ü�� ������ ����(0���� ����)
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() Method : ���� ��ü�� ���ؼ� ���� ���̸� ����
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() Method : �־��� ���ڿ��� ���� ��ü�� ����
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ� �Դϴ�.");
			}else {
				System.out.println("���� �Դϴ�.");
			}
		}
			
		//values() Method : ��� ���� ��ü���� �迭�� ����
		Week[] days = Week.values();
		for(Week day : days) {	//days ���� ���ʴ�� ��ü�� ���� Week day�� ����
			System.out.println(day);
		}
			
			
	}

}
