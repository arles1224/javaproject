package java1;

import java.util.Arrays;

public class Array10 {
	// 2차 배열
	public static void main(String[] args) {
		// 숫자 형태의 2차 배열
//		int data1[][] = {
//				{1,2,3},
//				{3,4,5},
//		};
		// 정적 배열 - 2차 배열에 데이터 넣기
		int data2[][] = new int[2][3];
		data2[0][0] = 10;
		data2[0][1] = 20;
		data2[0][2] = 30;
		data2[1][0] = 100;
		data2[1][1] = 200;
		data2[1][2] = 300;
		System.out.println(Arrays.toString(data2[0]));
		System.out.println(Arrays.toString(data2[1]));

	}

}
