package example;

import java2.mssql;

public class Example10 {

	public static void main(String[] args) {
		mssql ms = new mssql();
		ms.abc(); // 외부 메소드 호출
		mssql.main(args); // 외부 메인 메소드 호출. 정적 메소드이기 때문에 클래스에 속해 있어 클래스명으로 바로 호출한다.
		String ex = ms.bbb();
		System.out.println(ex);
	}

}
