package java2;

public class Method11 {
	// 상속 메소드 형태2
	public static void main(String[] args) {
		Student student = new Student();
		student.info("홍길동","30");
		student.print();
	}

}

class Person{
	protected String name; // 같은 패키지인 경우나 다른 패키지여도 하위 클래스일 경우 접근할 수 있다.
	protected String age;
	
	public void info(String name, String age) { // setter
		this.name = name;
		this.age = age;
	}
	protected void print() {
		System.out.println("고객명: "+this.name);
	}
}
class Student extends Person{
	@Override // annotation(주석). override 됐다고 표시하는 용도.
	public void print() { // 상위 클래스의 메소드와 동일한 이름과 인자값을 가진 메소드 생성.
		super.print(); // 상위 클래스의 메소드 호출.
		System.out.println("나이: "+this.age); // 상위 클래스의 print 메소드를 override 했다.
	}
}