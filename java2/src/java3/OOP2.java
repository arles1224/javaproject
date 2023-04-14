package java3;

public class OOP2 {
	// 변수 선언
	public static void main(String[] args) {
		Vars vars = new Vars();
		vars.abc();
	}

}
class Vars{
	public void abc() {
		int a = 10;
		if(a == 10) {
//			int b = 30; // if 안에서 생성되었기 때문에 b는 if 안에서만 사용할 수 있는 지역변수이다.
		}
//		int w = 0;
//		while(w < b) { // 변수 b를 가져올 수 없다.
//			w++;
//		}
	}
}