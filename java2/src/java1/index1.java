package java1;
//세포-조직-기관처럼 method-class-package
public class index1 { // index1 클래스. private class, protect class 등 다양한 종류가 있다.
	// 필드
	// 이곳에서 선언한 변수는 전역변수이다.
	public static void main(String[] args) { //main 메소드, java에서 기본으로 실행되는 최초의 함수.
		// class 안에 메소드가 위치한다.
		// 이곳에서 선언한 변수는 지역변수이다.
		
		//변수를 선언할 땐 자료형을 입력해야 한다.
		String a = "홍길동"; //자료형 : 문자열
		int b = 10; //자료형 : 정수, 크기: 4바이트
		System.out.println(a);
		int c = 20;
		int d = b + c;
		System.out.println(d);
		float e = 1.03f; //자료형 : 실수(float), 크기 : 4바이트
		double f = 1.03; //자료형 : 실수(double), 크기 : 8바이트
		System.out.println(e);
		System.out.println(f);
		
		long g = 123456789123456789L; //자료형 : 정수, 크기 : 8바이트
		System.out.println(g);
		
		/*
		 byte : -128 ~ 127 (1바이트, 2^7)
		 short : -32,768 ~ 32,767 (2바이트, 2^15)
		 int : -2,147,483,648~ 2,147,483,647 (4바이트, 2^31)
		 long : -9,223,372,036,854,775,808 ~ -9,223,372,036,854,775,807 (8바이트, 2^63)
		 보유할 수 있는 숫자 범위가 커지는 만큼 크기가 커지기 때문에 큰 숫자가 필요하지 않으면 크기가 작은 자료형을 사용하는 게 좋다.
		 */
	}

}
