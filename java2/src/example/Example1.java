package example;

class Korea { // 외부 class
	// 외부 field
	public void abc() { // 외부 메소드, 접근 제어자 없이 메소드 선언하면 기본으로 public이 적용된다.
		
	}
}

public class Example1 { // 클래스
	// Field. 인스턴스 변수 선언하는 공간.
	// 인스턴스 변수에는 접근 제어자를 사용할 수 있다.
	// private int a = 1; // 해당 클래스 안에서만 접근할 수 있다.
	// public int b = 2; // 접근 제한이 없다.
	// String c = "이순신"; // default로 선언된 변수. 해당 패키지 안에서만 접근할 수 있다.
	// protected int d = 3; // 해당 패키지 내에서나 다른 패키지에서 생성되었지만 해당 클래스의 자식 클래스인 경우 접근 가능하다.
	// 자식 클래스가 뭐지?
	public Example1() { // constructor(생성자) 클래스가 실행되자마자 즉시 실행
		
	}

	public static void main(String[] args) { // 정적 메소드. 프로세스 실행 메소드. main 메소드는 한 개만 존재한다.
		

	}

	public String abc() { // 문자열 리턴 메소드
		
		return null;
	}
	public void bbb() { // 리턴값 없는 일반 확장 메소드.
		// String a = "홍길동"; // 지역변수
		
	}
	public static void ccc() { // 정적 메소드. 프로그램이 시작할 때 메모리에 저장되어 상주한다.
		
	}
}
