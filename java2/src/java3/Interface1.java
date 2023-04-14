package java3;

public class Interface1 {
	// interface 사용법
	// Inter1.java, Inter2.java와 연계
	static void main(String[] args) {
		Key key = new Key();
		key.z1();
	}

}
class Key implements Inter1, Inter2{
	// a superclass must be a class.
	// interface를 상속 받기 위해서 implements를 사용한다.
	// interface는 extends와 다르게 여러 개를 한번에 상속 받을 때 상속에 상속을 하지 않고 한 번에 불러올 수 있다!
	// 실무에서는 extends보다 implements를 더 많이 사용한다.
	// OOP의 꽃이구나. 여러 interface를 부품처럼 미리 만들어 두고 필요한 것만 조합해서 사용하면 편하다.
	// interface의 단점 : 일반 메소드를 생성할 수 없다. 무조건 추상 메소드이다. default를 이용하면 메소드를 강제로 생성할 수는 있다.
	// 강제로 생성한 일반 메소드는 abstract와 마찬가지로 오버라이드가 강제되지 않는다.
	// abstract와 interface를 혼용해서 쓸 수는 있지만 그러면 막코드다.
	@Override
	public void z1() {
		System.out.println(Inter1.names);
	}
	@Override
	public void z2() {
		System.out.println(Inter1.names);
		System.out.println(Inter2.names);
		// System.out.println(this.names); // 에러 발생. Inter1과 Inter2가 동일한 이름의 변수가 있기 때문이다.
		
	}
	@Override
	public String z3() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void z1_1(int a, int b) { // 일반 메소드 오버라이드는 강제되지 않는다.
		Inter1.super.z1_1(a, b);
	}
}