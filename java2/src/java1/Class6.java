package java1;

public class Class6 {
	// 상수 선언하는 방법 + 외부 클래스 기본 메소드 이동
	// ECMAscript에 const처럼?
	public static void main(String[] args) {
		// 변수 선언 형태
		int a = 5;
		a = 10;
		System.out.println(a);
		
		// 상수 선언 형태
		final int b = 10; // final : 상수를 선언하는 키워드. Modifier.
		// 대표적인 modifier로는 public이 있다.
		// b = 5; //오류 발생한다.
		System.out.println(b);
		
		String id = "hong";
		new User(id); // 객체가 생성되는 바로 즉시 실행 메소드를 호출한다.
	}

}
class User{
	String person; // 필드에 있는 인스턴스 변수.
	public User(String id) { //  constructor(생성자). class와 반드시 이름이 같아야 한다.
		person = "홍길동";
		list(id); // 즉시 실행 메소드이기 때문에 객체 생성 없이 바로 list() 메소드 호출 가능.
	}
	public void list(String id) { // 즉시 실행 메소드에서 실행하는 메소드.
		System.out.println("사용자 리스트 출력");
		System.out.println(person);
		System.out.println(id);
		int p = point(); // return 메소드로 값을 받아서 처리.
		System.out.println(p);
	}
	int point () {
		return 5000;
	}
}
