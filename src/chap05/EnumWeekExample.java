package chap05;	//���� Ÿ�԰� ���� ���

import java.util.Calendar;	//Calendar Ŭ������ java.util ��Ű���� �����Ƿ� import �ʿ�

public class EnumWeekExample {
	public static void main(String[] args) {
		
		Week today = null;	//���� Ÿ�� ���� ����
		
		//Calendar�� �̿��� ��¥�� �ð��� ��� ���
		//-> Calendar ���� �����ϰ� Calendar.getInstance() �޼ҵ尡 �����ϴ� Calendar ��ü�� ��´�.
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);//��(1) ~ ��(7) ������ ���ڸ� ����
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("���� ���� : "+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� ������θ� �մϴ�.");
		}else {
			System.out.println("�ڹ� ���θ� �մϴ�.");
		}
		
		
		
	}
	
}
