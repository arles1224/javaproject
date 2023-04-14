package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List5 {
	// List 배열 사용법
	public static void main(String[] args) {
		String data[] = {"hong","kim","park"};
		List<String> aa = new ArrayList<>(Arrays.asList(data));
		aa.remove("park"); // 해당 문자를 삭제한다.
		System.out.println(aa);
		// add, remove 등의 사용법은 동일하다.
		List<Integer> bb = new ArrayList<>(5); // 저장 가능한 메모리 크기 초기화.
		// ArrayList의 메모리는 가변적이다.
		System.out.println(bb);
		
	}

}
