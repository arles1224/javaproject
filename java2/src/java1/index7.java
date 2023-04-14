package java1;

import java.util.Scanner;

public class index7 {

	public static void main(String[] args) {
		//하나의 Scanner 객체를 여러번 사용하는 형태.
		Scanner scanner = new Scanner(System.in);
		System.out.print("입금할 금액을 입력하세요. : ");
		int money = scanner.nextInt();
		System.out.print("입금을 진행하시겠습니까? ");
		String confirm = scanner.next();
		if(confirm.contains("네")==true) {
		System.out.printf("총 금액은 %d 원입니다.",money);
		}
		scanner.close();
	}

}
