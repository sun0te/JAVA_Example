package chap05;	//System.arraycopy()�� �迭 ����

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//System.arraycopy �޼ҵ�� �迭 ����
//System.arraycopy(Objectsrc, int srcPos, Object dest, int destPos, int length);
/* 	srcPos 	: �����迭���� ������ �׸��� ���� �ε���		
 	destPos : �� �迭���� �ٿ� ���� ���� �ε��� 
 	length	: ������ ���� 
 */
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
			
			
			
	}

}
