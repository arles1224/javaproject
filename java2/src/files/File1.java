package files;

import java.io.FileReader;

public class File1 {
	// I/O : input stream, output stream
	// 입력 스트림 : 프로그램으로 입력되는 부분. 키보드, 마우스, HDD 등
	// 출력 스트림 : 프로그램에서 출력하는 부분. 모니터, 스피커, 프린터 등
	// 스트림 : API 라이브러리를 사용하는 형태.
	// Java.io : API.
	// 일반 : File, FileReader -> Stream API : FileinputStream
	// 일반 : FileWriter -> Stream API : FileoutputStream
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\message.txt");
		// FileReader : 문자 데이터를 파일로부터 읽어 들이는 클래스. 파일 경로를 파라미터로 사용해서 FileReader 객체를 생성한다.
		// 메소드에 throws Exception 키워드를 사용하거나 예외처리문을 사용해야 작동한다.
		while(true) {
			int m = fr.read();
			System.out.print((char)m);
			if(m == -1) {
				break;
			}
		}
		fr.close();
	}

}
