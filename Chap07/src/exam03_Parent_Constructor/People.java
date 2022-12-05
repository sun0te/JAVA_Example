package exam03_Parent_Constructor;
//부모 클래스
public class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

/*
	기본 생성자가 없고 name 과 ssn 을 매개값으로 받아 
	객체를 생성시키는 생성자만 존재한다.
	
	People 를 상속하는 Student 클래스는 생성자에서 super(name, ssn) 으로 생성자 호출
*/