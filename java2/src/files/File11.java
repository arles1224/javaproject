package files;

import java.io.OutputStream;
import java.util.Arrays;

public class File11 {
	// OutputStream : 출력 담당
	// FileOutputStream, ObjectOutputStream, AudioOutputStream 등이 OutputStream을 상속 받는다.
	public static void main(String[] args) {
		try {
			Load load = new Load();
			load.output();
		}catch(Exception e) {
			System.out.println("메소드 오류");
		}
	}

}
class Load{
	OutputStream os;
	public void output() throws Exception{
		String data = "abcde";
		byte[] b = data.getBytes(); 
		// getBytes() 메소드 : 문자를 ASCII 배열로 변한
		System.out.println(Arrays.toString(b));
		this.os = System.out;
		this.os.write(b,0,b.length); // byte 단위의 배열값을 문자화 시키는 메소드. write(배열, 시작 인덱스, 종료 길이);
		this.os.flush(); // 출력하고 나서 버퍼를 비워준다.
		this.os.close();
	}
}