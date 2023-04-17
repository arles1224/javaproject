package java3;

public class Exception2 {

	public static void main(String[] args) {
		try {
			Exception2 ex = new Exception2();
			String data = "홍길동";
			ex.test(data); // 외부 메소드에 값 전달
		}catch(Exception e) {
			System.out.println(e); // 발생한 오류 출력
		}
	}
	public void test(String b) throws Exception { 
		// throws : 메인 메소드에서 예외처리 없이 메소드를 호출하는 것을 막기 위해 사용한다.
		// 예외처리문을 사용하지 않으면 해당 메소드를 호출할 수 없다.
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c; 
		// throw : 코드 맨밑에 사용한다. 예외처리 결과에 대한 값을 main 메소드로 다시 return시킨다.
	}
}
