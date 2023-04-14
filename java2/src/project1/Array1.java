package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {
	// ArrayList 배열 문자, 숫자 혼합 사용하기
	public static void main(String[] args) {
		String data[] = {"hong","park"}; // String 배열
		int data2[] = {10,20}; // int 배열
		
		// ArrayList에서 자료형이 다른 두 배열을 추가하기 위해선 Object 자료형을 사용합니다.
		/*
		 * Object : 문자, 숫자 상관 없이 모든 자료형을 다 받을 수 있는 자료형이다.
		 */
		ArrayList<Object> li = new ArrayList<>(Arrays.asList(data));
		li.add(data2[0]);
		li.add(data2[1]);
		System.out.println(li);
		
		// 계산 방식 1.
		//int sum = (int)li.get(2) + (int)li.get(3);
		// 계산 방식 2.
		//Object sum = (int)li.get(2) + (int)li.get(3);
		// 계산 방식 3.
		Integer sum = (Integer)li.get(2) + (Integer)li.get(3);
		System.out.println(sum);
		// Object에는 연산자를 사용할 수 없는 것 같다.
		
		// ArrayList 안에 데이터의 자료형을 알아내는 방법
		System.out.println(li.get(2).getClass().getName());
		
	}

}
