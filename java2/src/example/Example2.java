package example;
// class : 청사진
// object : 제품

public class Example2 {
	
	static final int data = 20; // final : 상수 선언. 메소드에도 사용할 수 있다.
	
	public static void main(String[] args) {
		System.out.println(data);
		// main에서는 field에 있는 인스턴스 변수를 직접 핸들링할 수 없다. main 메소드가 먼저 작동하고 나서 인스턴스와 확장 메소드가 작동하기 때문이다.
		// 확장 메소드에서는 인스턴스 변수를 직접 핸들링할 수 있다.
	}

}
