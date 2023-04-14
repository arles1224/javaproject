package java2;
// 부모 클래스 안의 자식 클래스
public class Method16 {

	public static void main(String[] args) {
		Green green = new Green(); // 부모 클래스 인스턴스 생성
		green.setter(10, 20);
		Green.Blue blue = green.new Blue(); // 부모 클래스 안에 자식 클래스 인스턴스 생성
		blue.print(); // 자식 클래스 안의 메소드 호출
	}

}
class Green { // 부모 클래스
	int aa, bb;
	String name = "홍길동";
	String userage = ""; // 자식 클래스에 있는 값을 setter로 사용하는 변수
	public void setter(int aa, int bb) {
		this.aa = aa;
		this.bb = bb;
		Blue blue = new Blue(); // 자식 클래스에 있는 값을 가져올 때에는 객체를 선언해야 한다.
		System.out.println(blue.age);
	}
	public void pt() {
		System.out.println("userage: "+this.userage);
	}
	class Blue{ // 자식 클래스
		int a1 = Green.this.aa; // 해당 필드에 class 변수 선언(this 사용 필수)
		int b1 = Green.this.bb;
		String age = "40";
		public void print() {
			Green.this.userage = age;
			System.out.println(Green.this.name);
			System.out.println(a1*b1);
			Green.this.pt();
		}
	}
}