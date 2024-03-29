package exam08_4_Abstract_Method_Override;
//실행 클래스
public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------");

		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();		//자동 타입 변환
		animal.sound();			//재정의된 메소드 호출
		
		animal = new Cat();		//자동 타입 변환
		animal.sound();			//재정의된 메소드 호출
		System.out.println("---------");
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {	//Animal animal : 자동 타입 변환 
		animal.sound();
	}

}
