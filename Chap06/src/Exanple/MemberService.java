package Exanple;
// Ȯ�ι��� 15��
public class MemberService {
	String id = "hong";
	String password = "12345";
	
	public boolean login(String id, String password) {
		if(this.id == id && this.password == password) {
			return true;
		} else {
			return false;
		}
	}
	
	public void logout(String id) {
		if(this.id == id) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�. ");
		}
	}
	
}
