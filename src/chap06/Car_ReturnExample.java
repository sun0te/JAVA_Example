package chap06;	//return 

public class Car_ReturnExample {

	public static void main(String[] args) {
		
		Car_Return myCar = new Car_Return();

		myCar.setGas(5);	//Car 의 setGas() 메소드 호출

		boolean Carstart = myCar.isLeftGas();	//Car의 isLeftGas() 메소드 호출해서 Carstart 변수에 저장
		
		if (Carstart) {		//Carstart 변수값이 true일 경우 
			System.out.println("출발합니다.");
			myCar.run();	//Car의 run() 메소드 호출
		}
		
		if(myCar.isLeftGas()) {	//Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다");
		} else {
			System.out.println("gas를 주입하세요");
			}
		} 

}
