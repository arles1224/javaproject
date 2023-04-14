package java1;

import java.util.Arrays;

// 해당 파일은 main() 메소드가 없기 때문에 실행 권한이 없다.
// Class_array1.java에서 호출해서 실행한다.

public class Data1 {
	// 전역 배열 변수
	String user[] = { "hong", "kim", "park" }; // 인스턴스 변수로 필드에 변수 선언
	int number = 0;

	public void userlist() {
		this.number = 100; // this : 전역 변수를 지칭한다.
		System.out.println(Arrays.toString(user));
		// Arrays를 사용하려면 import java.util.Arrays 필요하다.
		int w = 0;
		while (w < user.length) {
			System.out.println(user[w]); // 반복문으로 배열값 출력
			w++;
		}
	}
}
