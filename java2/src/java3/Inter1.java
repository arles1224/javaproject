package java3;

public interface Inter1 {
	String names = "홍길동";
	public void z1();
	
	// 일반 메소드를 선언하기 위해 default를 사용했다.
	default void z1_1(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
}
