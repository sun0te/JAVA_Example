package chap05;	//System.arraycopy()로 배열 복사

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//System.arraycopy 메소드로 배열 복사
//System.arraycopy(Objectsrc, int srcPos, Object dest, int destPos, int length);
/* 	srcPos 	: 원본배열에서 복사할 항목의 시작 인덱스		
 	destPos : 새 배열에서 붙여 넣을 시작 인덱스 
 	length	: 복사할 개수 
 */
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
			
			
			
	}

}
