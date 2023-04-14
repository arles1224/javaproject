package java3;

import java.util.*;

public class OOP3 {
	/*
	 * (주)씨이랩
	 * 응용문제2.
	 * 데이터 15,22,37,8,11,19,41 이 있다.
	 * 데이터를 다음 결과 같이 출력하시오.
	 * 결과) [7,15,22,8,11,39,41]
	 */
	public static void main(String[] args) {
		Test test = new Test();
		test.process();
	}
}
class Test {
	ArrayList<Integer> number;
	void process() {
		Integer[] data = {15,22,37,8,11,19,41};
		number = new ArrayList<>(Arrays.asList(data));
		number.add(0,7);
		number.remove(3);
		number.remove(5);
		number.add(5,39);
		System.out.println(number);
	}
}