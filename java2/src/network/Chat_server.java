package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Chat_server {
	// 채팅 서버
	public static void main(String[] args) {
		Chat_sv sv = new Chat_sv();
		sv.chatserver();
	}

}
class Chat_sv{
	private int port = 10001;
	private String mid;
	ServerSocket sk;
	Socket sc;
	Scanner scanner;
	InputStream is;
	OutputStream os;
	public void chatserver() {
		try {
			this.sk = new ServerSocket(this.port);
			this.scanner = new Scanner(System.in);
			System.out.print("ID : ");
			this.mid = this.scanner.next();
			System.out.println(mid + " has logged in.");
			while(true) {
				this.sc = sk.accept();
				this.is = this.sc.getInputStream();
				// 클라이언트 메세지를 출력하는 코드 시작
				this.os = this.sc.getOutputStream();
				byte[] data = new byte[1024];
				int user = this.is.read(data);
				String msg = new String(data,0,user);
				System.out.println(msg); // 클라이언트 메세지 받음
				// 클라이언트 메세지를 출력하는 코드 끝
				// 서버에서 클라이언트로 메세지를 전송하는 코드 시작
				this.scanner = new Scanner(System.in);
				System.out.print("Server Message : ");
				msg = this.scanner.nextLine();
				if(msg.equals("exit")) {
					this.sk.close();
					this.sc.close();
					this.scanner.close();
					this.is.close();
					this.os.close();
					break;
				}
				String cms = "["+this.mid+"] : "+ msg;
				this.os.write(cms.getBytes());
				this.os.flush();
				// 서버에서 클라이언트로 메세지를 전송하는 코드 끝
			}
		}catch(Exception e) {
			System.out.println("Port Connect Error");
		}
	}
}

// 서버 
// 1. 서버 가동
// 4. 접속 메세지 받음
// 5. 메세지 전송
// 9. 클라이언트 종료 메세지 출력
// 10. 대기