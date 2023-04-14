package java1;

import java.util.Scanner;

public class index11 {

	public static void main(String[] args) {
		// while
//		int a = 1;
//		while(a < 10) {
//			System.out.print(a);
//			a++;
//		}
		
		// do while문
//		int b = 1;
//		do {
//			System.out.print(b);
//			b++;
//		}while(b<10);
		
		//응용문제 3.
		//사용자가 두 개의 숫자를 입력했을 때, 두 숫자의 범위 안에 있는 모든 값을 더하는 코드를 작성하시오.
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 두 개를 입력하세요 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int sum = 0;
		String str = "";
		scanner.close();
		while(num1 <= num2) {
			sum += num1;
			if(num1 < num2) {
			str += num1+"+";
			}else {
				str += num1;
			}
			num1++;
		}
		System.out.println(str+" : "+sum);
	}

}
