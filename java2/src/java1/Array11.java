package java1;

import java.util.Arrays;

public class Array11 {
	// 2차 배열 응용
	public static void main(String[] args) {
		// 응용문제 8.
		// 주어진 Adata의 배열값을 더한 후 그 값이 짝수 혹은 홀수인지를 판별한 결과를 배열로 출력하시오.
		// Adata[0] = 5 17 19 22 23
		// Adata[1] = 1 2 3 4 5
		// Result = ["짝수","홀수","짝수","짝수","짝수"];
		int[][] Adata = {
				{5,17,19,22,23},
				{1,2,3,4,5}
		};
		int count = 0;
		int sum = 0;
		String[] array = new String[Adata[0].length];
		for(int n : Adata[0]) {
			sum = n + Adata[1][count];
			if(sum%2==0) {
				array[count] = "짝수";
			}else {
				array[count] = "홀수";
			}
			count++;
		}
		System.out.println(Arrays.toString(array));
	}

}
