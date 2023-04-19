package network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Net4 {

	public static void main(String[] args) {
		try {
			Crawling2 crawling2 = new Crawling2();
			crawling2.crack();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
class Crawling2{
	Scanner scanner;
	String url;
	URL urls;
	InputStream is;
	BufferedInputStream bs;
	public void crack() throws Exception{
		this.scanner = new Scanner(System.in);
		System.out.println("크롤링 할 URL을 입력하세요.(파일명 포함)");
		this.url = this.scanner.nextLine();
		this.urls = new URL(this.url);
		this.is = this.urls.openStream();
		this.bs = new BufferedInputStream(this.is);
		byte[] code = new byte[1024];
		FileOutputStream fs = new FileOutputStream("E:\\memo\\test3.html");
		int z = 0;
		while((z=this.bs.read(code))!= -1) {
			fs.write(code,0,z);
		}
		this.bs.close();
		this.is.close();
		this.scanner.close();
		fs.flush();
		fs.close();
	}
}