package java1;

public class Array2 {
	// 메소드로 배열을 전달하는 방법(1차 배열)
	public static void main(String[] args) {
		String user[] = {"hong","kim","park"};
		Array2 ar = new Array2();
		ar.abc(user); // abc 메소드에 배열을 전달.

	}
	public void abc(String array[]) { // 배열을 인자값으로 받는다.
		System.out.println(array.length);
		System.out.println(array[2]); // 배열값 출력.
	}

}
