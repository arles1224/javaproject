package java3;

public class Abstract3 {
	// 상속 2개 이상 가져오기
	public static void main(String[] args) {
		
	}

}
class ab3 extends aa2{ 
	// 더블 상속
	// 추상 클래스 aa를 상속 받은 추상 클래스 aa2를 상속 받은 class ab3
	// aa 뿐만 아니라 aa2의 추상 메소드도 반드시 상속 받아야 한다.
	@Override
	int password() {
		return 0;
	}
	@Override
	public String user_info() {
		return null;
	}
}