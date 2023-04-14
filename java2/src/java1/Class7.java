package java1;

import java.util.Scanner;

public class Class7 {
	// 응용편 : 회원가입 시 약관 동의 검증 및 간편 회원 가입 진행
	public static void main(String[] args) {
		// main() 메소드에는 코드 한 줄만 사용. 외부 클래스 사용할 것.
		new Member7();
	}

}
class Member7{
	Member7(){
		register();
	}
	void register() {
		String ag1 =  inputs("회원가입 약관에 동의하시겠습니까?(y/n) :","");
		if(ag1.equals("y")) {
			String ag2 = inputs("아이디를 입력하세요.","");
			if(ag2.equals("admin")) {
				System.out.println("해당 아이디는 중복되었습니다.");
			}else {
				String ag3 = inputs("비밀번호를 입력하세요.","");
				String ag4 = inputs("가입자명을 입력하세요.","y");
				System.out.printf("아이디:%s 비밀번호:%s 가입자명:%s",ag2,ag3,ag4);
			}
		}else {
			System.out.println("회원가입이 취소되었습니다.");
			System.exit(0);
		}
		
	}
	public String inputs(String msg,String exit) {		
		Scanner scanner = new Scanner(System.in);
		System.out.print(msg);
		String result = scanner.next();
		if(exit.equals("y")) {
			scanner.close();
		}
		return result;
	}
}