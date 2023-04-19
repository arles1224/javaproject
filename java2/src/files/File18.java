package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class File18 {
	// Buffered : read, write 단독으로 사용하지 않는다. Stream과 같이 쓴다.
	// read 메소드 : int형태
	// readLine 메소드 : String 형태
	// InputStream > InputStreamReader > BufferedReader
	
	// *** BufferedReader -> close 메소드로 메모리 누수 막는 것 필수
	// *** BufferedWriter -> flush 메모리 초기화 + close 종료 필수
	public static void main(String[] args) {
		try {
			
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			String test = br.readLine();
			System.out.println(test);
			is.close();
			br.close();

			OutputStreamWriter os = new OutputStreamWriter(System.out);
			BufferedWriter bw = new BufferedWriter(os);
			bw.write("홍길동");
			bw.flush();
			os.close();
			bw.close();
			
			// FileInputStream -> BufferedInputStream
			// FileOutputStream -> BufferedOutputStream
		}catch(Exception e) {
			
		}
	}

}
