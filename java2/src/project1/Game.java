package project1;

public interface Game {
	int pc = (int)Math.ceil(Math.random()*10);
	public void user(); // 사용자가 입력하는 부분
	public String result(int pc, int user); // 결과 반환
}
