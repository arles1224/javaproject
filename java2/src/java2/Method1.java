package java2;

public class Method1 {
	// 메소드를 이용한 동적 변수와 정적 변수 활용
	public static void main(String[] args) {
		tests tests = new tests(); // 클래스 객체를 생성해 인스턴스로 적용.
		tests.a++; // a = 2
		java2.tests.b++; // b = 2
		tests.t1();
		
		tests tt = new tests(); // 클래스 객체를 생성해 인스턴스로 적용.
		tt.a++; // 새로운 클래스 객체를 생성해 호출 시 int a = 1;부터 다시 시작하기 때문에 2가 된다.
		//tt.b++; // static이라 프로그램이 종료될 까지는 메모리에 값이 저장되어 있기 때문에 3이 된다.
		tt.t1();
		
		tests.user1 += " 유관순";
		java2.tests.user2 += " 유관순";
		tests.t2();
		
		tt.user1 += " 강감찬";
		//tt.user2 += " 강감찬";
		tt.t2();
	}
}
class tests{
	int a = 1; // 동적 변수. 클래스를 새로 호출하면 1부터 다시 불러온다.
	public static int b = 1; // 정적 변수. 메모리에 저장되기 때문에 변화된 값을 유지한다.
	
	String user1 = "이순신";
	public static String user2 = "홍길동";
	public void t1() {
		System.out.println(a);
		System.out.println(b);
	}
	public void t2() {
		System.out.println(user1);
		System.out.println(user2);
	}
}
