package files;

import java.io.FileReader;

public class File3 {
	// 자바에서는 모든 파일을 다 읽어 들일 수 있다.
	// .data, .dat, .json, .xml, .exe, .bat 등 모든 파일 가능.
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\files\\data.dat");
			System.out.print(fr.read());
			fr.close();
		}catch(Exception e) {
			System.out.println("파일 오류");
		}
	}

}
