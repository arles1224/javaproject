package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Net6 {

	public static void main(String[] args) {
		// 클라이언트 생성
		try {
			System.out.println("Client Connected");
			String ip = "192.168.10.157";
			int port = 9007;
			Socket sc = new Socket(ip,port);
			
			// 클라이언트에서 서버로 보낼 데이터
			String cmsg = "Hello World!";
			// 클라이언트에서 서버로 보내는 통로
			OutputStream os = sc.getOutputStream();
			os.write(cmsg.getBytes()); // byte로 전송
			os.flush();
			
			// 서버에서 보낸 메세지를 클라이언트가 받는 용도
			byte[] data = new byte[1024];
			InputStream is = sc.getInputStream();
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			sc.close();
			is.close();
			os.close();
		}catch(Exception e) {
			System.out.println("Server Connect Error");
		}
	}

}
