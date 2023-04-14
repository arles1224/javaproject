package java2;

// 상속 메소드(extends)

public class Method7 {
	public static void main(String[] args) {
		Box2 bx2 = new Box2();
		bx2.list();
		bx2.list2();
	}
}

class Box1{
	public String user_id;
	private String user_pw;
	public void list() {
		this.user_id = "hong";
	}
	public String pw() { // getter(무조건 return 메소드이다.) private를 Box2에서 직접 핸들링하지 못하기 때문에 return을 이용해 핸들링 할 수 있게 해줌.
		this.user_pw = "a123456";
		return this.user_pw;
	}
}

class Box2 extends Box1{ // extends : Box1을 상속 받아서 Box2에서 진행
// class Subclass(or derived class) extends Superclass(or base class) 
	// Subclass inherits non-private members(field and methods) of Superclass.
	public void list2() {
		System.out.println(this.user_id);
		
		String pass = this.pw(); // Box1에서 return으로 값을 가져옴.
		System.out.println(pass);
	}
}