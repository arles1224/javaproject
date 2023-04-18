package files;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) {
		Fl7 fl7 = new Fl7();
		try {
			fl7.test();
		}catch(Exception e) {
			System.out.println("오류");
			System.out.println(e);
			
		}
		
		Database database = new Database();
		try {
			database.db();
		}catch(Exception e) {
			System.out.println("오류");
		}
	}

}
class Fl7{
	LinkedList<String> test1;
	LinkedList<String> test2;
	ArrayList<LinkedList<String>> all;
	FileReader fr;
	Scanner scanner;
	public void test() throws Exception{
		this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\files\\member.txt");
		this.scanner = new Scanner(this.fr);
		this.test1 = new LinkedList<>();
		this.test2 = new LinkedList<>();
		int w = 0;
		while(scanner.hasNext()) {
			String[] aa = this.scanner.next().split(","); 
			int ea = aa.length;
			int ww = 0;
			while(ww < ea) {
				if(w==0) {
					this.test1.add(aa[ww]);
				}else {
					this.test2.add(aa[ww]);
				}
				ww++;
			}
			w++;
		}
		this.all = new ArrayList<>(2);
		this.all.add(test1);
		this.all.add(test2);
		System.out.println(all);
		this.scanner.close();
		this.fr.close();
		
	}
}
// 선생님 코드
class Database{
	FileReader fr;
	Scanner scanner;
	ArrayList<String[]> ln; // 빈 2차 배열
	String[] data;
	public void db() throws Exception{
		this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\files\\member.txt"); // Java는 상대경로가 없다.
		this.scanner = new Scanner(this.fr);
		this.ln = new ArrayList<>();
		while(scanner.hasNext()) {
			this.data = this.scanner.nextLine().split(",");
			ln.add(data);
		}
		System.out.println(ln); // 원시 배열이 들어가 있어서 메모리 주소로 나오나?
		System.out.println(Arrays.deepToString(this.ln.toArray())); // 2차 이상 배열의 배열값 출력 방법
		this.scanner.close();
		this.fr.close();
	}
}