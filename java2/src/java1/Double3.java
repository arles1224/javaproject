package java1;

import java.util.Scanner;

public class Double3 {

	public static void main(String[] args) {
		// 응용문제 7.
		// 사용자가 입력한 숫자 세 개 중 짝수만 곱해 결과값을 출력하시오.
		// 단, 짝수가 한 개이거나 없을 경우 "짝수를 두 개 이상 입력하세요."라는 메세지를 출력합니다.
		Scanner scanner = new Scanner(System.in);
		int w = 1;
		int counter = 0;
		int num;
		int sum = 1;
		while(w<=3) {
			System.out.print("숫자를 입력하세요 : "); //Scanner가 반복문에 들어갈 수 있다!
			num = scanner.nextInt();
			if(num%2==0) {
				counter++;
				sum *=num;
			}
			w++;
		}
		if(counter <= 1) {
			System.out.println("짝수를 두 개 이상 입력하세요");
		}else if(counter >=2){
			System.out.println(sum);
		}
		scanner.close();
	}

}
