package java2;

import java.util.*;
// Method10과 작업 연계

public class Method9 {
	// 메인 메소드에서 해당 배열을 직접 사용하기 위해 static을 사용해서 메모리에 상주시킴.
	static String[] msg = {
			"검색할 이름을 입력해주세요.","검색할 과목명을 입력하세요. [전체, 국어, 수학, 과학, 역사]"
			};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Method10 mt = new Method10();
		System.out.println(msg[0]);
		String user  = scanner.next();
		System.out.println(msg[1]);
		String subject = scanner.next();
		mt.score(user,subject);
		scanner.close();
		
		String result = mt.getData();
		if(subject.equals("전체")) {
			String[] all = result.split(",");
			System.out.printf("국어: %s, 수학: %s, 과학: %s, 역사: %s",all[0],all[1],all[2],all[3]);
		}else if(result == "false") {
			System.out.println("올바르지 않은 입력값입니다.");
		}else {
			System.out.println(subject +": "+result);
			
		}
	}
}