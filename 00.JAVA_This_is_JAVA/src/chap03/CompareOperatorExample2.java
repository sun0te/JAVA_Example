package chap03;	//비교 연산자 2

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //false 
		//모든 부동소수점 타입은 0.1을 정확히 표현할 수 없어 0.1f는 0.1의 근삿값 표시
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10)); //true
		
		
		
	}

}
