package network;

import java.net.InetAddress;

public class Net1 {
	// IPv4 : EX) 192.168.0.1 형태
	// IPv6 : EX) off2:3x12:911h:31xt 형태
	// local host : 자신의 서버.
	// TCP / UDP 
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getByName("localhost");
			// InetAddress : IPnetworkAddress를 말한다.
			// getByName : 접속할 도메인 주소를 입력하는 메소드.
			// getHostAddress : 접속하는 서비스의 IP 주소를 가져오는 메소드.
			// getAllByName : 배열이다.
			String ip = ia.getHostAddress();
			System.out.println(ia);
			System.out.println(ip);
			
			InetAddress[] ia2 = InetAddress.getAllByName("naver.com");
			System.out.println(ia2.length);
			int w = 0;
			while(w < ia2.length) {
				System.out.println(ia2[w].getHostAddress());
				w++;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
