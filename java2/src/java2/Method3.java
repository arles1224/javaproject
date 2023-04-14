package java2;

public class Method3 {
	// 메소드 접근 형태
	public static void main(String[] args) {
		cdb c = new cdb();
		c.a1 = "홍길동";
		//c.a2 = "실버 회원"; // the field cdb.a2 is not visible.
		cdb.a3 = "hong@nate.com";
		c.data1("실버회원");
	}

}
class cdb{
	String a1 = null; // 인스턴스
	private String a2 = null;
	public static String a3 = null;
	
	public void data1(String level){
		this.a2 = "실버회원"; // private는 같은 class 안에서만 접근할 수 있다. 값을 읽는 것조차도 불가능하다.
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}