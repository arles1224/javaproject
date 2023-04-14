package java2;

public class Method10 {
	private String name = null;
	private String subject = null;
	private String sign = "false";

	public void score(String name, String subject) { // setter
		this.name = name;
		this.subject = subject;
		String user[][] = {
				{"홍길동","이순신","유관순","강감찬","장보고"},
				{"80","77","92","67","100"}, // 국어
				{"40","100","80","92","67"}, // 수학
				{"95","88","42","98","50"}, // 과학
				{"40","92","100","95","30"} // 역사
		};
		int ea = user[0].length;
		int w = 0;
		int w2 = 1;
		while(w < ea) {
			if(user[0][w].equals(this.name)) {
				switch(this.subject) {
				case "국어" : 
					this.sign = user[1][w];
				break;
				case "수학" : 
					this.sign = user[2][w];
				break;
				case "과학" : 
					this.sign = user[3][w];
				break;
				case "역사" : 
					this.sign = user[4][w];
				break;
				case "전체" : 
					this.sign = "";
					w2 = 1;
					while(w2 < ea) {
						this.sign += user[w2][w]+",";
						w2++;
					}
				break;
				}
			}
			w++;
		}		
	}
	public String getData() { // getter 최종 결과값을 Method9로 전달.
		return sign;
	}
}
