package java1;

import java.util.Arrays;

public class Class_array1 {
	
	// 외부 파일에 있는 class + array
	// Data1.java와 함께 사용
	
	public static void main(String[] args) {
		Data1 db = new Data1(); // 외부 파일 class를 로드.
		System.out.println(Arrays.toString(db.user)); // 외부 파일 전역변수 출력.
		db.userlist(); // 외부 파일 메소드 호출
		System.out.println(db.number); // userlist() 메소드 호출보다 먼저 출력하면 0으로 나온다.
		// 호출하는 메소드에서 전역 변수 값을 수정했다면 메소드 호출 전에는 수정 전의 값이, 호출 후에는 수정 후의 값이 반영된다.
		
	}
}
