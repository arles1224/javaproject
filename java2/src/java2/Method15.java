package java2;

public class Method15 {
	// Override 규칙
	public static void main(String[] args) {
		
	}

}
class Color1 {
	public String abc() {
		return null;
	}
	public boolean zzz(String nm) {
		return true;
	}
}
class Color2 extends Color1{
	@Override
	public String abc() {
		return super.abc();
	}
	@Override
	public boolean zzz(String nm) { // 무조건 상속한 클래스의 메소드와 형식이 같아야 한다.
		return super.zzz(nm);
	}
	
	public void zzz() { 
		
	}
}