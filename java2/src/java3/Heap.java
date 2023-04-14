package java3;

public class Heap {
	
	// 메모리 영역 : 
	// Stack 영역 : CPU 캐시 메모리
	// Heap 영역 : 실제 메모리
	// 뭔 말이지
	static int box2 = 20; // Stack
	public static void main(String[] args) {
		int box1 = 20; // Stack 
		Integer box3 = 20; // Stack 
		Integer box4 = new Integer(20); // Heap 
		Integer box5 = 20;
		if(box1 == box3) {
			System.out.println("동일함");
		}
		if(box3 == box4) {
			System.out.println("일치합니다.1");
		}
		if(box3 == box5) {
			System.out.println("일치합니다.2");
		}
		if(box3.equals(box4)) { // value 비교
			System.out.println("일치");
		}
		if(box1 == box4) {
			System.out.println("일치함");
		}
	}

}
