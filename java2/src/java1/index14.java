package java1;

import java.util.Scanner;

public class index14 {

	public static void main(String[] args) {
		// 할인율 구하는 방법
		int money = 10000;
		int coupon = 20;
		double sum = money*(1-coupon*0.01);
		int i = (int)sum; //절삭
		int total = (int)Math.round(sum); //반올림
		//(int) : 자료형을 int로 변환할 때 사용한다.
		System.out.println(i);
		System.out.println(total);
		
		
		// 응용문제 4.
		// 총 금액이 50,000원일 때, 사용자에게 "적용할 할인율을 입력해주세요."라는 질문과 함께 숫자를 받습니다.
		// 사용자가 입력한 할인률을 적용한 최종 상품 금액을 출력하시오.
		Scanner scanner = new Scanner(System.in);
		System.out.println("총 상품 금액 50,000원에 적용할 할인율을 입력해주세요.");
		int sale = scanner.nextInt();
		double sum2 = 50000 * (1-sale*0.01);
		System.out.printf("최종 상품 금액은 %d원입니다.\n",(int)Math.round(sum2));
		System.out.printf("test %.1f", sum2);
		scanner.close();
	}

}
