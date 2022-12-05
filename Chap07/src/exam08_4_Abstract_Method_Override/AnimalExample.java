package exam08_4_Abstract_Method_Override;
//���� Ŭ����
public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------");

		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog();		//�ڵ� Ÿ�� ��ȯ
		animal.sound();			//�����ǵ� �޼ҵ� ȣ��
		
		animal = new Cat();		//�ڵ� Ÿ�� ��ȯ
		animal.sound();			//�����ǵ� �޼ҵ� ȣ��
		System.out.println("---------");
		
		//�޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {	//Animal animal : �ڵ� Ÿ�� ��ȯ 
		animal.sound();
	}

}
