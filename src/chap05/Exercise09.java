package chap05;	/*	Ű����� �л� ���� �� �л����� ������ �Է¹޾� 
					�ְ�����, ������� ���ϴ� ���α׷� */

//���� ����� ���� �ۼ�
//���� Scanner�� nextInt() �޼ҵ�� �ֿܼ� �Էµ� ���ڸ� �а� ����

import java.util.Scanner;
public class Exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1. �л� �� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("-------------------------------------");
			System.out.println("���� > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				//�ۼ� ��ġ
				System.out.println("�л� �� > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			} else if(selectNo == 2) {
				//�ۼ� ��ġ
				
				for(int i = 0; i < studentNum; i++) {
					System.out.println("scores["+i+"] > ");
					scores[i] = scanner.nextInt();
					
				}
				
			} else if(selectNo == 3) {
				//�ۼ� ��ġ
				for(int i = 0; i < studentNum; i++) {
				System.out.println("scores["+i+"] : "+scores[i]);
				}
				
			} else if(selectNo == 4) {
				//�ۼ� ��ġ
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				
				for(int i = 0; i < studentNum; i++) {
					if(scores[i] > max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				
				avg = (double)sum / studentNum;
				
				System.out.println("�ְ� ���� : "+max);
				System.out.println("��� ���� : "+avg);
				
				
			} else if(selectNo == 5) {
				run = false;
			}
			
		}
		
		
		
		System.out.println("���α׷� ����");
		
		
	}

}
