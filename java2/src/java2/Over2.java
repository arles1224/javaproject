package java2;

import java.util.*;

public class Over2 {
	// class : Over1, method : userlist(String)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String nm = scanner.next();
		Myinfo myinfo = new Myinfo();
		myinfo.userlist(nm);
		scanner.close();
	}
}
class Myinfo extends Over1{
	int ea;
	@Override
	public void userlist(String username) {
		super.userlist(username);
		//System.out.println(Arrays.toString(this.list[0]));
		
		this.ea = this.list.length;
		int w = 0;
		while(w < this.ea) {
			if((this.list[w][0]).equals(username)) {
				System.out.println(Arrays.toString(this.list[w]));
				break;
			}
			w++;
		}
	}
}