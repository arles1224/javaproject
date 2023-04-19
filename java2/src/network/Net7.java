package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Net7 {

	public static void main(String[] args) {
		String ip = "192.168.10.157";
		int port = 9002;
		try {
			Chat chat = new Chat();
			chat.server_connect(ip, port);
		}catch(Exception e) {
			System.out.println("Connect Error");
		}
	}
}
class Chat{
	Scanner scanner;
	// 밑의 세 개는 서버와 클라이언트 모두 무조건 사용한다.
	Socket socket; // 서버는 accept 메소드, 클라이언트는 상대방 IP와 포트 번호
	OutputStream os;
	InputStream is;
	public void server_connect(String ip, int port) throws Exception {
		this.socket = new Socket(ip,port);
		System.out.println("Connected");
		this.os = this.socket.getOutputStream(); // 서버로 데이터를 내보낸다.
		this.is = this.socket.getInputStream(); // 서버로부터 데이터를 받는다.
		this.scanner = new Scanner(System.in);
		
		System.out.print("message : ");
		String msg = this.scanner.nextLine();
		String username = "YongRim : ";
		String chat = username + msg;
		this.os.write(chat.getBytes());; // write로 getBytes로 바이트로 변환해 전송
		this.os.flush(); // 메모리 초기화
		this.os.close(); // 종료
	}
}