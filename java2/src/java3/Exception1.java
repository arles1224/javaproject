package java3;

// I/O : Input and Output.
// 예외 처리 : I/O에서 첨부파일 기능(<input type="file"> 같은 것)을 구현하기 위해선 예외처리가 필요하다.

public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "C1";
		try { // 첫 번째로 실행.
			a = Integer.valueOf(b);
			System.out.println(a); // 윗줄에서 문제 발생해서 작동 안 함. 
		}catch(Exception e) { // try에서 Exception(오류) 발생하면 바로 실행.
			System.out.println("숫자로 변환할 수 없습니다.");
			// 어떠한 오류가 발생했는지 체크한다.
		}finally { // catch 다음에 실행하고 예외처리문을 빠져나간다.
			b = b.replaceAll("[a-zA-Z]", ""); // 정규식 싫어.....
			a = Integer.valueOf(b);
		}
		System.out.println(a);
	}

}
