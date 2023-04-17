package files;

import java.io.FileWriter;

public class File4 {
	// 배열 파일로 정리
	public static void main(String[] args) {
		String[] userdata = {"hong","kim","park","jang","kang"};
		try {
			//FileWriter : 문자 데이터를 파일에 쓰는 클래스이다.
			FileWriter fw = new FileWriter("E:\\git_java\\javaproject\\java2\\src\\files\\message2.txt");
			// 경로 뒤에 ,true가 있으면 기존에 있던 데이터를 유지한 채로 추가한다. true가 없으면 덮어 쓴다.
			int w = 0;
			// write : 문자, 배열, 숫자 등 다양한 데이터를 파일에 저장하는 메소드이다.
			do {
				fw.write("{userdb:"+userdata[w]+"}");
				w++;
			}while(w < userdata.length);
			fw.close();
		}catch(Exception e) {
			
		}
	}

}
