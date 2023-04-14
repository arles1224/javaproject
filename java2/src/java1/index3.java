package java1;

public class index3 {

	public static void main(String[] args) {
		//if문
		int a = 10, b = 20;
		if(a < b) {
			System.out.println("b값이 큽니다.");
		}else if(a > b) {
			System.out.println("a값이 큽니다.");
		}else {
			System.out.println("두 값이 같습니다.");
		}
		
		//응용문제 1.
		//1번 항목은 숫자 10, 9, 22이며 2번 항목은 19, 10, 2입니다.
		//첫 번째 두 번째 숫자는 더하고 세 번째 숫자는 곱해서 결과값이 작은 항목이 출력되도록 코드를 작성하시오.
		int data1 = 10+9*22;
		int data2 = 19+10*2;
		if(data1 > data2) {
			System.out.println("2번 항목 결과가 작습니다.");
		}else if(data1 < data2) {
			System.out.println("1번 항목 결과가 작습니다.");
		}else {
			System.out.println("두 결과 값이 같습니다.");
		}
		
		String userid = "hong";
		String userpw = "a123456";
		if(userid == "hong" && userpw == "a123456") {
			System.out.println("로그인 되셨습니다.");
		}else{
			System.out.println("아이디 및 패스워드를 확인하세요.");
		}
		int a1 = 100;
		double a2 = a1/(double)3;
		//정수를 실수로 자료형 변환
		//실수를 정수로 변환은 (int)숫자
		System.out.println(a2);
		
		int b1 = 100;
		String b2 = Integer.toString(b1); // 정수를 문자열로 변환하는 방법.
		int b3 = Integer.parseInt(b2)+100; // 문자열을 정수로 변환하는 방법.
		//int b4 = Integer.valueOf(b2);
		byte b5 = Byte.parseByte(b2);
		System.out.println(b2+", "+b3+", "+b5);
		
		//증가, 감소
		int z = 10;
		z++;
		System.out.println(z);
		
		// 간단한 문자 표현
		// char f = 'h'; //""와 '' 구분할 것.
	}

}
