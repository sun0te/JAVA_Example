package chap03;

public class OverflowExample { //오버플로우 해결

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = 1000000; //int는 오버플로우
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}

}
