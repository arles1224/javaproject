package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.nio.charset.Charset;

public class File8 {
	// BufferedReader(Output) : CPU 캐시 메모리에 임시 저장하기 때문에 속도가 빠르다.
	// BufferedReader는 입출력 속도를 향상시키기 위해 사용한다. 배열에 빠르게 데이터를 이동시킬 수 있어서 편하다.
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		try {
			buffer.dataview();
		}catch(Exception e) {
			
		}
	}

}
class Buffer {
	FileReader fr;
	BufferedReader br; // 캐시 메모리 사용
	public void dataview() throws Exception{
		this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\files\\notice.txt",Charset.forName("UTF8"));
		this.br = new BufferedReader(this.fr);
		// LineNumberReader 용 인스턴스 새로 생성
		FileReader fr2 = new FileReader("E:\\git_java\\javaproject\\java2\\src\\files\\notice.txt",Charset.forName("UTF8"));
		LineNumberReader li = new LineNumberReader(fr2);
		// LineNumberReader는 BufferedReader를 상속 받아 만들어졌다. 따라서 내부적으로 버퍼를 사용한다.
		// 현재 읽고 있는 라인의 번호를 추적하는 기능이 추가되어서 파일 내의 특정 라인을 찾을 때 유용하게 사용할 수 있다.
		// 이 외에는 BufferedReader와 큰 차이점이 없다.
		int ea = 0;
		while(li.readLine()!=null) {
			ea = li.getLineNumber();
		}
		System.out.println(ea);
		li.close();
//		while(true) {
//			if(this.br.readLine() == null) { // **버퍼는 조건문 등 어디에든 사용하면 캐시에 등록되었다가 제거된다. 따라서 현재 반복문은 두 번째, 네 번째 라인이 출력된다.**
//				break;
//			}
//			System.out.println(this.br.readLine());
//		}
		String text = "";
		while((text=this.br.readLine())!=null) {
			System.out.println(text);
		}
		fr.close();
		br.close();
	}
}