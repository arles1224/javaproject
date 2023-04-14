package java1;

import java.util.Scanner;

public class Class10 {
	// 로그인 프로세스
	public static void main(String[] args) {
		new Login1();
//		userlogin ul = new userlogin();
//		ul.login();
	}
}
class Login1{
	String result, id, pw;
	Scanner scanner = new Scanner(System.in);
	Login1() {
		process(0);
	}
	public void process(int count) {
		if(count >= 3) {
			message("해당 아이디는 10분 후에 다시 로그인 하실 수 있습니다.");
			System.exit(0);
		}
		id = message("아이디를 입력하세요: ","");
		if(id == "hong") {
			pw = message("패스워드를 입력하세요: ","");
			if(pw == "a123456") {
				message("로그인 되었습니다.");
			}else {
				System.out.println("아이디 또는 패스워드가 틀렸습니다.");
				re(count);
			}
		}else {
			message("가입되지 않은 사용자입니다.");
		}	
	}
	public String message(String m1, String m2) {
		System.out.print(m1);
		result = scanner.next().intern();
		return result;
	}
	public void message(String m1) {
		System.out.println(m1);
		scanner.close();
	}
	public void re(int count) {
		count++;
		process(count);
	}
}
//class userlogin {
//	int count = 0; // 비밀번호 오류 카운트
//	Scanner scanner = new Scanner(System.in);
//	String msg = "";
//	public String pwck(String id) {
//		count++;
//		System.out.print("비밀번호를 입력하세요 : ");
//		String pw = scanner.next();
//		if(pw.equals("a123456") && id.equals("hong")) {
//			msg = "yes";
//		}else if(id.equals("hong") && !pw.equals("a123456")){
//			if(count < 3) {
//				System.out.println("올바르지 않은 비밀번호입니다.("+count+")");
//				pwck(id);
//			}else {
//				msg = "no";
//			}
//		}else if(!id.equals("hong")) {
//			msg = "invalidId";
//		}
//		return msg;
//	}
//	public void login() {
//		System.out.print("아이디를 입력하세요 : ");
//		String id = scanner.next();
//		String result = pwck(id); //result가 yes이면 로그인 성공, no면 로그인 실패
//		if(result == "yes") {
//			System.out.println("로그인 되었습니다.");
//		}else if(result == "no"){
//				System.out.println("해당 아이디는 10분 후에 다시 로그인 하실 수 있습니다.");
//		}else if(result == "invalidId") {
//			System.out.println("가입되지 않은 사용자입니다.");
//		}
//		scanner.close();
//	}
// }
