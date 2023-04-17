package files;

import java.io.FileReader;
import java.util.ArrayList;
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
		String[] aa = this.scanner.next().split(","); 
		int ea = this.scanner.next().split(",").length;
		int w = 0;
		while(w < ea) {
			if(w < ea/2) {
				this.test1.add(aa[w]);
			}else {
				this.test2.add(aa[w]);
			}
			w++;
		}
		this.all = new ArrayList<>(2);
		this.all.add(test1);
		this.all.add(test2);
		
	}
}
