package files;

import java.io.*;

public class File12 {
	// Stream을 이용한 파일 로드
	public static void main(String[] args) {
		try {
			Filein filein = new Filein();
			filein.fileload();
		}catch(Exception e) {
			
		}
	}

}
class Filein {
	InputStream is;
	
	public void fileload() throws Exception{
		this.is = new FileInputStream("E:\\git_java\\javaproject\\java2\\src\\files\\notice.txt");
		System.out.println(is.available()); // 크기(343 바이트) 출력
		// Returns an estimate of the number of bytes that can be read (or skipped over) from this input stream without blocking, 
		// which may be 0, or 0 when end of stream is detected.
		byte temp[] = new byte[is.available()]; // 파일 용량만큼의 크기인 byte 배열을 생성했다.
		// byte temp[] = new byte[1024*16]; // 배열 크기를 지정해서 생성. 크기가 16KB까지인 파일만 받을 수 있게 용량 제한을 두기 위해 배열 크기를 지정했다.
		//this.is.read(temp);
		String data = new String(temp, 0, this.is.read(temp));
		System.out.println(data);
	}
}