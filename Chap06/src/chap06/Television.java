package chap06;	//정적 초기화 블록

public class Television {
	
	//세 개의 정적 필드를 가지고 있는데, 
	//company, model 은 선언 시 초기값을 주었고 info는 초기화하지 않았다. 
	//info 필드는 정적 블록에서 company와 model 필드값을 서로 연결해서 초기값을 설정한다. 
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}

}
