package example;

import java.util.Scanner;

// 응용문제 1.
// "7000원 결제 하시겠습니까?" 질문이 나오고 나서 숫자 1을 입력하면 "결제를 진행합니다." 출력 후 프로세스가 종료되고,
// 숫자 2를 입력하면 "결제가 취소되었습니다." 출력 후 프로세스가 종료되는 코드를 작성하시오.

public class Example3 {
	
	final int money = 7000;
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Example3 process = new Example3();
		process.prc();
	}
	
	public String prc() {
		System.out.print(this.money + "원을 결제하시겠습니까?\n1. 결제 진행 2. 결제 취소\n입력 : ");
		int answer = this.scanner.nextInt();
		String result = "";
		if(answer == 1) {
			print("결제를 진행합니다.");
		}else if(answer == 2) {
			print("결제가 취소되었습니다.");
		}else {
			System.out.println("잘못된 입력입니다.\n");
			prc();
		}		
		return result;
	}
	public void print(String message) {
		System.out.println(message);
		this.scanner.close();
		System.exit(0);
	}
	
}
