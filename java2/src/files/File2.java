package files;

import java.io.FileReader;
import java.nio.charset.Charset;

public class File2 {

	public static void main(String[] args) {
		// Charset.forName("UTF8"/"EUCKR") : 인코딩 언어셋을 변경할 때 사용한다. 출력하는 언어셋만 바꾸는 것이지 파일 자체의 언어셋을 바꾸는 것이 아니다.
		// EUCKR = ANSI
		try {
			FileReader fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\agree.txt", Charset.forName("UTF8")); // UTF8로 인코딩 변경하는 방법
			System.out.println(fr.getEncoding()); // 파일 인코딩 언어 출력(UTF8)
			System.out.println(fr.read()); // Reads a single character. -1 if the end of the stream has been reached.
			System.out.print((char)fr.read());
			while(true) {
				int a = fr.read();
				if(a == -1) {
					break;
				}
				System.out.print((char)a);
			}
			fr.close(); // 메모리 누수를 막기 위해 객체는 사용을 완료하면 반드시 닫는다.
		}catch(Exception e) {
			System.out.println("파일 경로 오류");
		}

	}

}
