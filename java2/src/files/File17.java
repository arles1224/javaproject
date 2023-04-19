package files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class File17 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("E:\\memo\\cats.png");
			if(is.available() > 1048576) {
				
			}else {
				BufferedInputStream bs = new BufferedInputStream(is);
				int total = bs.available();
				byte filesize[] = new byte[total];
				bs.read(filesize);
				OutputStream os = new FileOutputStream("E:\\memo\\copy.png");
				os.write(filesize);
				os.flush();
				os.close();
				bs.close();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}