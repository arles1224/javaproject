package files;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class File6 {
	// Scanner + FileReader 응용
	public static void main(String[] args) throws Exception {
		Notice notice = new Notice();
		notice.view();
	}

}
class Notice{
	FileReader fr;
	Scanner scanner;
	public void view() {
		try {
			this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\files\\notice.txt",Charset.forName("UTF8"));
			this.scanner = new Scanner(this.fr); // this.fr(읽어온 파일)을 스캐너 소스로 지정.
			// Scanner produces values scanned from the specified source.
			// System.out.println(this.scanner.hasNext()); // hasNext() : Returns true if this scanner has another token in its input.
			while(true) {
				System.out.println(this.scanner.nextLine()); // 띄어쓰기를 구분자로 인식하지 않기 위해 nextLine 사용.
				if(this.scanner.hasNext() == false) {
					break;
				}
			}
			this.scanner.close();
			this.fr.close();
		}catch(Exception e) {
			System.out.println("파일 오류");
		}
	}
}