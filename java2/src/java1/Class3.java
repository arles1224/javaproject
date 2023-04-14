package java1;

public class Class3 {
	
	// 외부 class 생성 시 static 사용 여부
	// 같은 package 안에서는 static을 사용하지 않아도 공유가 가능하다.
	// 다른 package로 공유하려면 static을 사용한다.
	
	// return 메소드 
	
	public static void main(String[] args) {
		Box box = new Box();
		box.abc();
		
		// static 메소드가 아닐 경우, 같은 class 안에 있어도 객체 생성 후에 메소드를 호출해야 한다.
		Class3 class3 = new Class3();
		class3.bbb();
		
		// return 메소드 값 받기
		String result = class3.zzz();
		System.out.println(result);
		int result2 = class3.kkk();
		System.out.println(result2);
		
		// static 메소드인 경우, 메소드가 메모리에 저장되어 있기 때문에 Coupon class의 객체를 생성하지 않아도 메소드를 바로 호출할 수 있다.
		// static을 많이 만들면 메모리 할당이 너무 많아지기 때문에 반드시 필요한 경우에만 사용한다.
		Coupon.event();
	}
	void bbb() {
		int a = 10000;
		double b = a / 0.5;
		System.out.println(b);
	}
	
	// return 메소드(문자)
	String zzz() {
		String a = "배고파";
		return a;
	}
	// return 메소드(숫자)
	int kkk() {
		int a = 10;
		return a;
	}

}
//static 메소드가 있는 경우
class Coupon {
	public static void event() {
		int cp = 30;
		System.out.println(cp);
	}
}
//static 메소드가 없는 경우
class Box {
	public void abc() {
		System.out.println("test");
	}
}