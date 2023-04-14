package java1;

public class Array1 {
	// 1차 배열
	public static void main(String[] args) {
		
		// [] : 배열을 변수에 선언할 때 사용하는 기호.
		
		// 문자열 배열
		String user[] = {"홍길동","이순신","강감찬"};
		// String[] user = {"홍길동","이순신","강감찬"}; // 이것도 가능
		// 배열 길이
		int ea = user.length;
		System.out.println(user[0]);
		System.out.println(ea);
		
		// 숫자 배열
		int number[] = {1,2,3,4,5};
		System.out.println(number[0]);

	}

}
