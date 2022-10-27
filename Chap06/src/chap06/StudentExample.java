package chap06;	//클래스로부터 객체 생성

// new 는 클래스로부터 객체를 생성시키는 연산자
// new 연산자로 생성된 객체는 메모리 heap 영역에 생성

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
}
// new 연산자를 사용한 만큼 객체가 메모리에 생성된다.
// 이러한 객체들은 Student 클래스의 인스턴스 들이다.