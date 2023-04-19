package network;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class Net3 {
	// crawling 사용법
	public static void main(String[] args) {
		try {
			Crawling crawling = new Crawling();
			crawling.crack();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
class Crawling{
	Scanner scanner;
	String url;
	URL urls;
	InputStream is;
	InputStreamReader ir;
	public void crack() throws Exception {
		this.scanner = new Scanner(System.in);
		System.out.println("크롤링 할 URL을 입력하세요.(파일명 포함)");
		this.url = this.scanner.nextLine();
		this.urls = new URL(this.url);
//		URLConnection con = this.urls.openConnection();
		
		this.is = this.urls.openStream(); // 통신에는 openStream만 사용한다.
		this.ir = new InputStreamReader(this.is); // URL 소스파일 읽기
		BufferedReader br = new BufferedReader(this.ir); // 읽은 소스 파일을 메모리에 저장
		FileOutputStream fs = new FileOutputStream("E:\\memo\\test2.html"); //  빈 파일 생성
		PrintWriter pw = new PrintWriter(fs); // write에 String을 사용할 수 있게 해준다.
		String code = "";
		while((code=br.readLine())!=null) {
			pw.write(code);
		}
		System.out.println("크롤링 완료");
		pw.close();
		fs.flush();
		fs.close();
		this.is.close();
		this.scanner.close();
	}
}