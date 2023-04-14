package java3;

import java.util.*;

public class Try1 {
	// 예외처리방식
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int box;
		// try-catch : 예외처리문
		try { // 오류 발생 감지
		System.out.println("숫자를 입력하세요.");
		box = scanner.nextInt();
		System.out.println(box+"를 입력하셨습니다.");
		}
		catch(InputMismatchException aa){
			System.out.println("문자가 입력되었습니다.");
		}
		catch(Exception e){ // 오류 발생 시 작동
			System.out.println(e); // 오류 종류 출력
			System.out.println("숫자만 입력하세요.");
		}
		
		scanner.close();
	}

}
