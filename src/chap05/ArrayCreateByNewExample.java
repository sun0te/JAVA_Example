package chap05;	//new �����ڷ� �迭 ����

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1["+i+"] : "+arr1[i] );
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0;i < 3; i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);			
		}
		System.out.println();
		
		double[] arr2 = new double[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		System.out.println();
		
		String[] arr3 = new String[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		arr3[0] = "January";
		arr3[1] = "February";
		arr3[2] = "March";
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);		
		}
		
		
	}

}
