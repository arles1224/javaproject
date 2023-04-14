package java2;

public class Method14 {
	// boolean 리턴 메소드
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		boolean result = test1.equals(30);
		if(result == false) {
			System.out.println("숫자를 입력하세요.");
		}else {
			System.out.println("올바른 값입니다.");
		}
	}

}
class Test1 extends Abc{
	@Override
	public boolean equals(int z) {
		return super.equals(z);
	}	
}
class Abc {
	public boolean equals(int z) { // 같은 class의 값을 비교하는 메소드.
		return true; // 숫자로 들어올 경우 true로 반환.
	}
}