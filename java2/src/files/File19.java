package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class File19 {
	// BufferedInputStream : 미디어 파일
	// BufferedReader : 텍스트 파일
	public static void main(String[] args) {
		try {
			String url = "E:\\git_java\\javaproject\\java2\\src\\files\\user.txt";
			InputStream fs = new FileInputStream(url);
			InputStreamReader ir = new InputStreamReader(fs);
			BufferedReader br = new BufferedReader(ir);
			//System.out.println(br.readLine());
			String result = "";
			while((result = br.readLine()) != null) {
				System.out.println(result);
			}
			fs.close();
			ir.close();
			br.close();
		}catch(Exception e) {
			System.out.print(e);
		}

	}

}
