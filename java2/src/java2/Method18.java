package java2;
// Method17과 연계
public class Method18 extends Method17 {

	public static void main(String[] args) {
		Method17.main(args);
		Method18 method18 = new Method18();
		method18.test();
	}
//	@Override
//	public void name() {
//		System.out.println(this.abc); // 오버로딩
//		super.name();
//	}
	@Override
	public void test() {
		super.test();
	}

}
class Md extends Pt{ // Pt : method17번에 있는 메소드
	@Override
	public void display() {
		super.display();
	}
}
class Data{
	public void name() {
		System.out.println("외부 클래스 데이터 로드");
	}
}



//규칙
// 1. final이나 static으로 선언된 메소드는 오버라이드 할 수 없다.
// 2. 다른 파일에 있는 외부 클래스를 상속할 수 있다.
// 3. 메인 클래스에 외부 클래스를 상속시킬 수 있다.