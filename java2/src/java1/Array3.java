package java1;

import java.util.Scanner;

public class Array3 {
	// 배열 응용편
	public static void main(String[] args) {
		String user[] = {"hong","kim","park","jang","han"};
		// 응용문제 1.
		// "아이디를 입력하세요." 문구 후에 사용자가 아이디를 입력했을 때,
		// 일치하는 아이디가 있으면 "해당 아이디를 확인했습니다."라고 출력합니다.
		// 일치하는 아이디가 없으면 "미가입자입니다."라고 출력합니다.
		// 외부 class를 이용해 코드를 작성하시오.
		Array3a ac = new Array3a();
		ac.process(user);
	}

}

class Array3a{
	Scanner scanner = new Scanner(System.in);
	public void process(String array[]) {
		print("아이디를 입력하세요 : ");
		String answer = scanner.next();
		scanner.close();
		byte w = 0;
		byte count = 0;
		while(w<array.length) {
			if(answer.equals(array[w])) {
				count++;
			}
			w++;
		}
		if(count == 0) {
			print("미가입자입니다.");
			System.exit(0);
		}else {
			print("해당 아이디를 확인했습니다.");
			System.exit(0);
		}
	}
	public void print(String msg) {
		System.out.print(msg);
	}
}
