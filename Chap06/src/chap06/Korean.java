package chap06;	//생성자에서 필드 초기화

public class Korean {

	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	public Korean(String n, String s) {
		//this.필드, this 는 객체 자신의 참조
		this.name = n;	//name : 필드, n : 매개변수
		this.ssn = s;	//ssn = s 도 가능
	}
	
}
