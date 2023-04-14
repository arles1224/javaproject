package java1;

import java.util.Arrays;

public class Array8 {
	// 배열 합치기 응용
	public static void main(String[] args) {
		// 응용문제 7.
		// 배열 2가지를 다음 결과처럼 값을 출력하시오.
		// 1번 data : 대한민국 일본 중국 베트남 태국
		// 2번 data : 40 35 70 55 32
		// 결과 : ["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(32)"]
		String[] data1 = {"대한민국","일본","중국","베트남","태국"};
		int[] data2 = {40,35,70,55,32};
		int ea = data1.length;
		String[] result = new String[ea];
		
		int w = 0;
		while(w < ea) {
			result[w] = String.format("%s(%d)",data1[w],data2[w]);
			w++;
		}
		System.out.println(Arrays.toString(result));
	}
}
