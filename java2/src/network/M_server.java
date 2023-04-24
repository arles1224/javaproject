package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class M_server {
	// Thread를 이용한 모든 사용자에게 push 알림 보내는 네트워크
	public static void main(String[] args) {
		new Chatroom();
	}
}
class Chatroom{
	static final int port = 10001;
	ServerSocket sk;
	Socket sc;
	public Chatroom() {
		try {
			this.sk = new ServerSocket(port);
			System.out.println("********PUSH********");
			while(true) {
				this.sc = this.sk.accept(); // 클라이언트 접속 허가
				Thread thread = new Chat_Thread(this.sc); // accept 전송
				thread.start();
			}
		}catch(Exception e) {
			System.out.println("Port Error");
		}
	}
}
class Chat_Thread extends Thread{
	InputStream is;
	OutputStream os;
	Scanner scanner;
	static ArrayList<Socket> user = new ArrayList<Socket>();
	// 배열을 메모리에 저장하는 이유 : 접속자를 누적시키기 위해서이다.
	private String msg;
	public Chat_Thread(Socket sc) {
		try {
			//System.out.println("********Welcome********");
			Chat_Thread.user.add(sc);
			this.is = sc.getInputStream();
			this.os = sc.getOutputStream();
			//System.out.println(Chat_Thread.user);
		}catch(Exception e) {
			System.out.println("Socket Error");
		}
	};
	@Override
	public void run() {
		try {
			while(true) {
				byte[] data = new byte[1024];
				int n = this.is.read(data);
				this.msg = new String(data,0,n);
				
				this.scanner = new Scanner(System.in);
				System.out.println("push message : ");
				String result = this.scanner.nextLine();
				
				// 한 명이 입력한 내용을 접속한 모든 사용자에게 전달하기 위해 반복문 사용
				for(int i=0;i<Chat_Thread.user.size();i++) {
					this.os = Chat_Thread.user.get(i).getOutputStream();
					this.os.write(result.getBytes());
					this.os.flush();
				}
			}
		}catch(Exception e) {
			System.out.println("Cilent Exit Successes");
		}
	}
}
