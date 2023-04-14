package example;

import java.util.Arrays;
import java.util.Collections;

// 반복문 (for, while, do-while)
// 배열 관련 반복문(for( : ))
public class Example5 {
	Integer data[] = {10,8,5,3,1}; // 1차 숫자 배열
	String data2[] = {"z","b","a","e","d","c"};
	
	public static void main(String[] args) {
		Example5 ex = new Example5();
		ex.array();
	}
	
	void array() {
		// 응용문제2.
		// 해당 배열의 모든 값을 합한 결과를 출력하시오.
		int result = 0;
		for(int a : data) {
			result += a;
		}
		System.out.println(result);
		
		Arrays.sort(this.data); // 오름차순. int, String, Integer 모두 가능
		Arrays.sort(this.data,Collections.reverseOrder()); // 내림차순 int 사용 불가, Integer 사용해야한다.
		Arrays.sort(this.data2,Collections.reverseOrder()); // 내림차순
		System.out.println(Arrays.toString(this.data));
		System.out.println(Arrays.toString(this.data2));
	}
}
