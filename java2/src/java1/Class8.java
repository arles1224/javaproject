package java1;

public class Class8 {
	// 메소드 오버라이딩
	public static void main(String[] args) {
		Class8 z = new Class8();
		z.abc("홍길동");
		z.abc("이순신","장보고","유관순");
		z.abc("홍길동","강감찬");

	}
	// 인자값이 다르면 이름이 같아도 다른 메소드라고 인식한다.
	public void abd(int a) {
		
	}
	public void abc(String a) {
		System.out.println(a);
	}
	public void abc(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	public void abc(String a, String b,String c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
