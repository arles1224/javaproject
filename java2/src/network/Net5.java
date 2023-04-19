package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Net5 {
	// socket 통신 : Server, Client 양방향 통신 EX)자동 업데이트
	// HTTP 통신 : 이미지, 동영상, 음악 등 사용자 요청에 맞춰서 단방향 통신이 이루어짐.
	public static void main(String[] args) {
		// 서버 생성
		System.out.println("Server Connect");
		int port = 8080; // 포트 번호
		try {
			ServerSocket ss = new ServerSocket(port); // 포트를 오픈 시킴
			while(true) {
				System.out.println("연결 대기중");
				Socket sc = ss.accept(); // accept : 클라이언트가 들어오는 것을 대기하는 역할
				
				// 클라이언트가 접속 했을 경우 밑의 라인부터 시작. 접속 완료.
				System.out.println("호스트 : 통신 연결 성공");
				
				// getInputStream : 서버가 클라이언트에게서 받는 통로
				InputStream is = sc.getInputStream();
				
				// getOutputStream : 서버에서 클라이언트로 보내는 통로
				OutputStream os = sc.getOutputStream();
				
				byte data[] = new byte[1024]; // 클라이언트에게서 받는 데이터를 바이트로 받는다.
				int n = is.read(data); // 데이터를 읽어 들인다.
				String msgclient = new String(data,0,n); // 문자 자료형으로 변환
				System.out.println(msgclient); // 출력
				
				// 클라이언트로 메세지 전송
				String aws = "반갑습니다."; // 서버에서 보낼 메세지 작성
				os.write(aws.getBytes()); // 클라이언트로 보내기 위한 메모리 저장
				os.flush();
				os.close();
				is.close();
				ss.close();
				sc.close();
			}
		}catch(Exception e) {
			System.out.println("Server Connect Error");
			System.out.println(e);
		}
		
	}

}
