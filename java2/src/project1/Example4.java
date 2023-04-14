package project1;

import java.util.Arrays;
import java.util.LinkedList;

public class Example4 {
	// ArrayList, List, LinkedList에서 사용하는 옵션
	public static void main(String[] args) {
		String[] data = {"hong","kim","park"}; 
		LinkedList<String> nums = new LinkedList<>(Arrays.asList(data));
		System.out.println(nums);
		nums.clear(); // 배열값을 비운다.
		System.out.println(nums);
		nums.add("a");
		nums.add("b");
		nums.add("c");
		System.out.println(nums);
		nums.set(2, "zz"); // 지정된 인덱스의 데이터를 변경한다.
		System.out.println(nums);
		boolean result = nums.contains("b"); // contains는 데이터를 빠르게 찾을 때 사용한다. 찾는 값이 있으면 true 없으면 false를 반환한다.
		System.out.println(result);
	}

}
