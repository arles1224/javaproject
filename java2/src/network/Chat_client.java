package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Chat_client {
	// 채팅 클라이언트
	public static void main(String[] args) {
		Chat_cl ch = new Chat_cl();
		ch.client();
	}

}
class Chat_cl{
	private String ip = "192.168.10.148";
	private int port = 10001;
	private String mid;
	private String msg;
	Socket sc;
	Scanner scanner;
	InputStream is;
	OutputStream os;
	public void client() {
		try {
			this.scanner = new Scanner(System.in);
			System.out.print("ID : ");
			this.mid = this.scanner.nextLine();
			// 서버
			int count = 0;
			while(true) {
				this.sc = new Socket(this.ip, this.port);
				this.is = this.sc.getInputStream();
				this.os = this.sc.getOutputStream();
				if(count == 0) { // 최초로 서버에 접속 했을 경우 서버로 보내는 메세지
					this.msg = "["+this.mid+"] has logged in.";
					count++;
				}else {
					this.scanner = new Scanner(System.in);
					System.out.print("message : ");
					String cms = this.scanner.nextLine();
					this.msg = "["+this.mid+"] : " + cms;
					if(cms.equals("exit")) {
						this.msg = "Log out";
						this.os.write(msg.getBytes());
						this.is.close();
						this.scanner.close();
						this.os.flush();
						this.os.close();
						this.sc.close();
						break;
					}
				}
				// 서버로 메세지 전송하는 코드
				this.os.write(this.msg.getBytes());
				this.os.flush();
				//서버에서 메세지 받는 코드
				byte[] msg = new byte[1024];
				int n = this.is.read(msg);
				String servertext = new String(msg,0,n);
				System.out.println(servertext);
			}
		}catch(Exception e) {
			System.out.println("Server Connection Error");
		}
	}
}

// 클라이언트
// 2. 접속
// 3. 접속 메세지 서버로 전송
// 6. 서버의 메세지를 출력
// 7. exit 입력 -> 종료 메세지 전송 
// 8. 소켓 종료