package java1;

public class Class1 { // class 안에 method를 선언한다. class는 단독으로 사용할 수 있지만 method는 단독으로 사용하는 경우가 거의 없다.
	// main class.
	// public class는 한 번만 사용할 수 있다.
	// field 공간. 이곳에 선언한 변수와 객체는 전역으로 사용된다.
	static int money = 10000; // 클래스 변수. 메모리에 할당된다.
	public static void main(String[] args) { //main() 메소드는 실행 메소드이다. main() 메소드가 있어야 코드를 실행할 수 있다.
		// static : 메모리를 직접적으로 핸들링하는 속성이다. static을 붙이면 메모리에 해당 메소드가 할당된다.
		//String name = "유관순"; //지역변수
		
		Adata adata = new Adata(); // 해당 class를 object로 변환
		Bdata bdata = new Bdata();
		System.out.println(adata.a); // adata.a : adata라는 object 안에 a라는 변수
		System.out.println(bdata.a);
		
		Cdata cdata = new Cdata(); // class를 object화 시켜서 로드한다.
		cdata.aa = 10; // Cdata class 안의 aa 변수를 호출해 값을 override 했다.
		cdata.bb = 30;
		cdata.cc = cdata.aa + cdata.bb;
		System.out.println(cdata.cc);
		// 변수를 모아 놓은 보조 class를 만들면 main() 메소드를 깔끔하게 사용할 수 있다.
	}

}

class Adata{
	// 보조 class
	// 인스턴스 변수 = 전역변수
	String a = "홍길동";
}
class Bdata{
	// 보조 class
	String a = "이순신";
}
class Cdata{
	int aa, bb, cc;
}