package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class M_client {
	// Thread를 이용한 모든 사용자가 push 알림 받는 네트워크
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("User Id : ");
		String mid = scanner.nextLine().intern();
		if(mid == "") {
			System.out.println("Id Error");
		}else {
			new Mchat(mid);
			scanner.close();
		}
	}
}
class Mchat{
	private String ip = "192.168.10.148";
	private int port = 10001;
	private String msg;
	Socket sc;
	Scanner scanner;
	InputStream is;
	OutputStream os;
	public Mchat(String id) {
		try {
			this.sc = new Socket(this.ip,this.port);
			this.os = this.sc.getOutputStream();
			this.msg = "**Hello** My Name is ["+id+"]";
			this.os.write(this.msg.getBytes());
			this.os.flush();

			while(true) {
				this.sc = new Socket(this.ip,this.port);
				this.is = this.sc.getInputStream();
				
				byte data2[] = new byte[1024];
				int n2 = this.is.read(data2);
				this.msg = new String(data2,0,n2);
				System.out.println(this.msg);
				
//				this.scanner = new Scanner(System.in);
//				System.out.println("message : ");
//				this.msg = this.scanner.nextLine();
//				this.os.write(this.msg.getBytes());
//				this.os.flush();
				
				byte[] data = new byte[4096];
				int n = this.is.read(data);
				this.msg = new String(data,0,n);
				System.out.println(this.msg);
			}
			
		}catch(Exception e) {
			System.out.println("Server Error");
		}
	}
}