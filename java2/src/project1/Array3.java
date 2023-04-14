package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Array3 {
	// 원시 배열 값을 Object 배열로 이관하기
	public static void main(String[] args) {
		Ob1 ob1 = new Ob1();
		ob1.data1();
	}

}
class Ob1{
	ArrayList<Object[]> al; // 2차 이상 배열 
	Object data[][]; // 원시 2차 배열
	// 2차 원시 배열 생성 시 Object로 생성해야 합니다.
	
	public void data1() {
		this.data = new Object[][]{
				{"hong","kim","park","hong","kang","jang"},
				{2000,5000,4000,2200,3100,4120}
		};
		this.al = new ArrayList<>(Arrays.asList(this.data));
		System.out.println(Arrays.toString(this.al.get(0)));
		
		/*
		 * 응용문제 1.
		 * 위의 배열값 중 포인트의 평균값을 출력하시오.
		 * 예시) 총 평균 포인트는 0원입니다.
		 */
		int w = 0;
		Integer sum = 0;
		Integer ea = this.al.get(1).length;
		while(w < ea) {
			sum += (int)this.al.get(1)[w];
			w++;
		}
		Integer result = sum / ea;
		System.out.println(result);
	}
}