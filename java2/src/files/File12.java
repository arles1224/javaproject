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
	}
}