package files;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class File10 {
	// Stream 사용법
	// Stream : 이미지, 동영상, 오디오 같은 파일을 로드하기 위해서 사용한다.
	// InputStream : 모든 입력 장치에 대한 값을 받는 클래스. int로 받는다.
	// FileInputStream, AudioInputStream, ObjectInputStream 등이 InputStream을 상속 받는다.
	// OutputStream : 모든 출력 장치에 대한 값을 받는 클래스.
	public static void main(String[] args) {
		InputStream is = new InputStream() { // 오버라이드된 read 메소드가 기본 적용된다. 그 외에 별도의 메소드는 사용하지 않는다.
			
			@Override
			public int read() throws IOException {
				int a = 15;
				return a;
			}
		};
		try {
			System.out.println(is.read()); // 위에 있는 read 메소드 호출해서 return값 출력
		}catch(Exception e) {
			
		}
		
		// InputStream 파생 InputStreamReader. FileInputStream과 같다.
		InputStreamReader ir = new InputStreamReader(is,Charset.forName("UTF8")); // 언어셋을 변경할 때 사용한다.
		try {
			System.out.println(ir.read());
			ir.close();
			is.close();
		}catch(Exception e) {
			
		}

		// 키보드값 로드
		InputStream user = System.in;
		try {
			int keycode = user.read(); // 사용자가 입력한 키를 읽어서 아스키 코드로 변환.
			System.out.println(keycode);
			user.close();
		}catch(Exception e) {
			
		}
		
		
		// ASCII와 바이너리의 차이점
		// ASCII : 문서, html, css, js 등의 파일은 아스키 코드로 이루어져 있다.
		// 바이너리 : 이미지, 동영상 등의 미디어 파일은 바이너리 코드로 이루어져 있다.
	}

}
