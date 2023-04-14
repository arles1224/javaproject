package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2 {
	// Object 배열 응용편
	public static void main(String[] args) {
		// Object 배열에 숫자와 문자 데이터를 각각 추가
		ArrayList<Object> al = new ArrayList<>();
		al.add("hong");
		al.add(25);
		al.add("hong@nate.com");
		al.add(6000);
		al.add("01023451235");
		System.out.println(al);
		System.out.println(al.get(3).getClass().getName());
		
		// 2차 원시 Object 배열
		Object data[][] = {
				{"hong","kim","park","jang"},
				{25,30,44,21}
		};
		System.out.println(Arrays.toString(data[1]));
		
		// 복합적 Object 배열
		//Object[] userinfo = {"hong",23,"서울","01023457789",5000};
	}

}
