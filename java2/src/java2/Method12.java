package java2;

import java.util.*;

public class Method12 {

	public static void main(String[] args) {
		Bbox2 bbox2 = new Bbox2();
		bbox2.ask();
	}

}

class Bbox1{
	protected String user;
	public void ask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("고객명을 입력하세요.");
		this.user = scanner.next();
		scanner.close();
	}
	public void search(String nm) {
		
	}
}

class Bbox2 extends Bbox1{
	@Override
	public void ask() { // 상위 클래스와 이름이 같은 메소드 생성
		super.ask(); // Bbox1의 ask 메소드를 호출
		search(this.user); // override
	}
	@Override
	public void search(String nm) { // 상위 클래스와 이름이 같은 메소드 생성
		super.search(nm); // Bbox1의 search 메소드 호출
		if(nm.equals("홍길동")) { // override
			System.out.println("가입된 사용자입니다.");
		}else {
			System.out.println("가입되지 않은 사용자입니다.");
		}
	}
}