package java2;
// Method18과 연계
public class Method17 {

	public static void main(String[] args) {
		Pt pt = new Pt();
		pt.display();
	}
	
	public void test() {
		System.out.println("test");
	}
}
class Pt{
	public void display() {
		System.out.println("메인 데이터 호출");
	}
}