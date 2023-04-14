package java3;
// 추상 클래스(가상 클래스)
public class Absctract1 {
	
	public static void main(String[] args) {
		box2 b = new box2();
		b.sbox();
	}
}

abstract class box{ // 추상 클래스
	protected abstract void sbox(); // 추상 메소드
	abstract String result(); // 추상 리턴 메소드
}

class box2 extends box{
	// 추상 클래스를 상속 받은 자식 클래스는 반드시 추상 클래스 내부의 메소드를 오버라이드 해야 한다. 제약을 걸기 위해 사용한다.
	@Override
	public void sbox() { // 자식 클래스의 메소드는 오버라이드 한 부모 클래스의 메소드보다 접근 제한자의 범위가 더 넓어야 한다.
		
	}
	@Override
	String result() {
		return null;
	}
}