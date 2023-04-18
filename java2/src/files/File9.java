package files;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

// 라이브러리의 io와 nio의 차이
// io : 기본 input과 output을 사용
// nio : 버퍼 활용. io보다 성능이 좋다.

public class File9 {
	// 파일 데이터를 배열로 전송하기
	public static void main(String[] args) {
		Filedata filedata = new Filedata();
		try {
			filedata.addfile();
		}catch(Exception e) {
			System.out.println("메소드 호출 오류");
		}
	}

}
class Filedata{
	List<String> data;
	LinkedList<String> data2;
	public void addfile() throws Exception{
		// Files.readAllLines : 파일 내의 모든 텍스트 라인을 읽어 들인다.
		// Returns : the lines from the file as a List; whether the List is modifiable or not is implementation dependent and therefore not specified
		this.data = Files.readAllLines(Paths.get("E:\\git_java\\javaproject\\java2\\src\\files\\notice.txt"));
		System.out.println(this.data);
		// List랑 ArrayList는 정상 출력 되는데 LinkedList는 오류난다.
		// 객체를 인스턴스 메모리로 등록 시킨 후 강제로 파일 배열값을 적용할 수 있다.
		// 하지만 위 작업은 데이터의 추가 제거가 잦은 작업이 아니기 때문에 ArrayList를 쓰는 것이 효율적이다.
		
		// LinkedList에 강제로 적용하는 방법. 비추.
		this.data2 = new LinkedList<String>(Files.readAllLines(Paths.get("E:\\git_java\\javaproject\\java2\\src\\files\\notice.txt")));
		System.out.println(data2);
		
		// 원시 배열로 받는 방법(byte 단위로 처리)
		// 단점 : byte는 메모리 할당이 많아진다.
		byte[] data3 = Files.readAllBytes(Paths.get("E:\\git_java\\javaproject\\java2\\src\\files\\notice.txt")); // 언어 패킷 사용 불가
		System.out.println(new String(data3)); // 1차 배열로만 처리할 수 있다.
		

	}
}