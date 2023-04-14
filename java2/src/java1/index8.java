package java1;

import java.util.Scanner;

public class index8 {

	public static void main(String[] args) {
		// Scanner와 문자열 비교
		// equals : ==
		// 다를 때는 !mid.equals();
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디를 입력하세요: ");
		String mid = scanner.next().intern(); //숫자는 intern() 사용하지 않아도 검증 가능하다.
		//intern() : 문자에 한해서 조건문에서 equals를 사용하지 않고 비교할 때 사용한다.
//		if(mid.equals("kim") || mid.equals("park")) { 요즘 실무에서는 이렇게 안 쓴다.
//			System.out.println("회원이 확인되었습니다.");
//		}
		if(mid =="kim" || mid == "park") {
		System.out.println("회원이 확인되었습니다.");
	}else {
		System.out.println("비회원입니다.");
	}
		
		//응용문제1. 100 이하의 숫자를 입력 받습니다. 100 초과일 경우 "숫자는 100까지 입력할 수 있습니다."라는 메세지가 출력되도록 제작하시오.
		//추가 ) 사용자가 입력한 숫자가 짝수인지 홀수인지 출력하시오.
		System.out.print("1부터 100까지 중 숫자를 입력하세요 : ");
		byte num = scanner.nextByte();
		String num2;
		if(num > 100) {
			System.out.println("숫자는 100까지 입력할 수 있습니다.");
		}else {
			if(num%2 == 0) {
				num2 = "짝수";
			}else {
				num2 = "홀수";
			}
			System.out.printf("입력하신 숫자는 %d이며 %s입니다.",num,num2);
		}
		
		scanner.close();
	}

}
